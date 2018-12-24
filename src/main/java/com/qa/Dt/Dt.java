package com.qa.Dt;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.commons.beanutils.BeanUtils;

import javax.xml.bind.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sources",
    "mapper"
})
@XmlRootElement(name = "dt")
@XStreamAlias("dt")
public class Dt {

    @XmlElement(required = true)
    protected Dt.Sources sources;
    @XmlElement(required = true)
    protected Dt.Mapper mapper;


    public Dt.Sources getSources() {
        return sources;
    }


    public void setSources(Dt.Sources value) {
        this.sources = value;
    }


    public Dt.Mapper getMapper() {
        return mapper;
    }


    public void setMapper(Dt.Mapper value) {
        this.mapper = value;
    }
    public void addAttr(Dt.Attr sourceAttr){
        Attr target = new Attr();
        getSources().getSource().getAttr().add(sourceAttr);
        try {
            BeanUtils.copyProperties(target, sourceAttr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        target.setFormat("");
        target.setExpression("${sourceMap."+sourceAttr.getName()+"}");
        getMapper().getTarget().getAttr().add(target);

    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @XStreamAlias("attr")
    public static class Attr {

        @XmlAttribute(name = "name")
        @XStreamAsAttribute
        protected String name;
        @XStreamAsAttribute
        @XmlAttribute(name = "type")
        protected String type;
        @XStreamAsAttribute
        @XmlAttribute(name = "format")
        protected String format;
        @XStreamAsAttribute
        @XmlAttribute(name = "expression")
        protected String expression;

        public String getName() {
            return name;
        }


        public void setName(String value) {
            this.name = value;
        }


        public String getType() {
            return type;
        }


        public void setType(String value) {
            this.type = value;
        }


        public String getFormat() {
            return format;
        }

        public void setFormat(String value) {
            this.format = value;
        }

        public String getExpression() {
            return expression;
        }

        public void setExpression(String value) {
            this.expression = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "target"
    })
    public static class Mapper {

        @XmlElement(required = true)
        protected Dt.Mapper.Target target;

        public Dt.Mapper.Target getTarget() {
            return target;
        }


        public void setTarget(Dt.Mapper.Target value) {
            this.target = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attr"
        })
        public static class Target {

            @XmlElement(required = true)
            @XStreamImplicit
            protected List<Dt.Attr> attr;
            @XStreamAsAttribute
            @XmlAttribute(name = "format")
            protected String format;
            @XStreamAsAttribute
            @XmlAttribute(name = "formatRule")
            protected String formatRule;


            public List<Dt.Attr> getAttr() {
                if (attr == null) {
                    attr = new ArrayList<Dt.Attr>();
                }
                return this.attr;
            }

            public String getFormat() {
                return format;
            }


            public void setFormat(String value) {
                this.format = value;
            }

            public String getFormatRule() {
                return formatRule;
            }


            public void setFormatRule(String value) {
                this.formatRule = value;
            }

           

        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "source"
    })
    public static class Sources {

        @XmlElement(required = true)
        protected Dt.Sources.Source source;

        public Dt.Sources.Source getSource() {
            return source;
        }


        public void setSource(Dt.Sources.Source value) {
            this.source = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attr"
        })
        public static class Source {

            @XmlElement(required = true)
            protected List<Dt.Attr> attr;
            @XmlAttribute(name = "id")
            @XStreamAsAttribute
            protected String id;
            @XStreamAsAttribute
            @XmlAttribute(name = "format")
            protected String format;
            @XStreamAsAttribute
            @XmlAttribute(name = "alias")
            protected String alias;


            public List<Dt.Attr> getAttr() {
                if (attr == null) {
                    attr = new ArrayList<Dt.Attr>();
                }
                return this.attr;
            }

            public String getId() {
                return id;
            }


            public void setId(String value) {
                this.id = value;
            }


            public String getFormat() {
                return format;
            }

            public void setFormat(String value) {
                this.format = value;
            }


            public String getAlias() {
                return alias;
            }


            public void setAlias(String value) {
                this.alias = value;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Attr {

                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "format")
                protected String format;
                @XmlAttribute(name = "formatRule")
                protected String formatRule;


                public String getName() {
                    return name;
                }


                public void setName(String value) {
                    this.name = value;
                }


                public String getType() {
                    return type;
                }


                public void setType(String value) {
                    this.type = value;
                }


                public String getFormat() {
                    return format;
                }


                public void setFormat(String value) {
                    this.format = value;
                }


                public String getFormatRule() {
                    return formatRule;
                }


                public void setFormatRule(String value) {
                    this.formatRule = value;
                }

            }

        }

    }

}
