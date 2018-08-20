//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.3.0-b170531.0717 ���ɵ�
// ����� <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.07.09 ʱ�� 11:01:00 PM CST 
//


package domain.dt;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jd.zhang package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jd.zhang
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dt }
     * 
     */
    public Dt createDt() {
        return new Dt();
    }

    /**
     * Create an instance of {@link Dt.Mapper }
     * 
     */
    public Dt.Mapper createDtMapper() {
        return new Dt.Mapper();
    }

    /**
     * Create an instance of {@link Dt.Mapper.Target }
     * 
     */
    public Dt.Mapper.Target createDtMapperTarget() {
        return new Dt.Mapper.Target();
    }

    /**
     * Create an instance of {@link Dt.Sources }
     * 
     */
    public Dt.Sources createDtSources() {
        return new Dt.Sources();
    }

    /**
     * Create an instance of {@link Dt.Sources.Source }
     * 
     */
    public Dt.Sources.Source createDtSourcesSource() {
        return new Dt.Sources.Source();
    }

    /**
     * Create an instance of {@link Dt.Mapper.Target.Attr }
     * 
     */
    public Dt.Mapper.Target.Attr createDtMapperTargetAttr() {
        return new Dt.Mapper.Target.Attr();
    }

    /**
     * Create an instance of {@link Dt.Sources.Source.Attr }
     * 
     */
    public Dt.Sources.Source.Attr createDtSourcesSourceAttr() {
        return new Dt.Sources.Source.Attr();
    }

}
