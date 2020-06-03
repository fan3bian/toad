package util;

import org.apache.commons.collections4.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.*;


public class ValidatorUtil2 {

    /**
     * 校验类工厂
     */
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    public static Result validate(Object object, Class<?>... groups) {
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Object>> validateResult = validator.validate(object, groups);
        if (!validateResult.isEmpty()) {   //如果校验有值
            List<String> errMsgList = new ArrayList<String>();
            Iterator iterator = validateResult.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation violation = (ConstraintViolation) iterator.next();
                errMsgList.add(violation.getMessage());
            }
            return new ValidatorUtil2().new Result(Boolean.FALSE, errMsgList);
        } else {
            return new ValidatorUtil2().new Result(Boolean.TRUE);
        }
    }

    public static Result validateCollection(Collection<?> collection, Class<?>... groups){
        if(CollectionUtils.isNotEmpty(collection)){
            Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();
                Result validate = validate(next, groups);
                if(!validate.isPass()){
                    return validate;
                }
            }
        }
        return new ValidatorUtil2().new Result(Boolean.TRUE);
    }


    public class Result {
        private boolean isPass;

        private List<String> errMsgList;

        public Result(boolean isPass) {
            this.isPass = isPass;
        }

        public Result(boolean isPass, List<String> errMsgList) {
            this.isPass = isPass;
            this.errMsgList = errMsgList;
        }

        public boolean isPass() {
            return isPass;
        }

        public List<String> getErrMsgList() {
            return errMsgList;
        }

        public void setErrMsgList(List<String> errMsgList) {
            this.errMsgList = errMsgList;
        }
    }

}
