//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.3.0-b170531.0717 ���ɵ�
// ����� <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.07.09 ʱ�� 11:01:00 PM CST 
//


package domain.dt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sources",
    "mapper"
})
@XmlRootElement(name = "dt")
public class Dt {

    @XmlElement(required = true)
    protected Sources sources;
    @XmlElement(required = true)
    protected Mapper mapper;

    /**
     * ��ȡsources���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Sources }
     *     
     */
    public Sources getSources() {
        return sources;
    }

    /**
     * ����sources���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Sources }
     *     
     */
    public void setSources(Sources value) {
        this.sources = value;
    }

    /**
     * ��ȡmapper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Mapper }
     *     
     */
    public Mapper getMapper() {
        return mapper;
    }

    /**
     * ����mapper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Mapper }
     *     
     */
    public void setMapper(Mapper value) {
        this.mapper = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "target"
    })
    public static class Mapper {

        @XmlElement(required = true)
        protected Target target;
        public Target getTarget() {
            return target;
        }

        public void setTarget(Target value) {
            this.target = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attr"
        })
        public static class Target {

            @XmlElement(required = true)
            protected List<Attr> attr;
            @XmlAttribute(name = "format")
            protected String format;
            @XmlAttribute(name = "formatRule")
            protected String formatRule;

            /**
             * Gets the value of the attr property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attr property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttr().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Attr }
             * 
             * 
             */
            public List<Attr> getAttr() {
                if (attr == null) {
                    attr = new ArrayList<Attr>();
                }
                return this.attr;
            }

            /**
             * ��ȡformat���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * ����format���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * ��ȡformatRule���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormatRule() {
                return formatRule;
            }

            /**
             * ����formatRule���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormatRule(String value) {
                this.formatRule = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="expression" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Attr {

                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "format")
                protected String format;
                @XmlAttribute(name = "expression")
                protected String expression;

                /**
                 * ��ȡname���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * ����name���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * ��ȡtype���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * ����type���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * ��ȡformat���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * ����format���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * ��ȡexpression���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExpression() {
                    return expression;
                }

                /**
                 * ����expression���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExpression(String value) {
                    this.expression = value;
                }

            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="source"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="attr" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="formatRule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "source"
    })
    public static class Sources {

        @XmlElement(required = true)
        protected Source source;

        /**
         * ��ȡsource���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Source }
         *     
         */
        public Source getSource() {
            return source;
        }

        /**
         * ����source���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Source }
         *     
         */
        public void setSource(Source value) {
            this.source = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="attr" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="formatRule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attr"
        })
        public static class Source {

            @XmlElement(required = true)
            protected List<Attr> attr;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "format")
            protected String format;
            @XmlAttribute(name = "alias")
            protected String alias;

            /**
             * Gets the value of the attr property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attr property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttr().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Attr }
             * 
             * 
             */
            public List<Attr> getAttr() {
                if (attr == null) {
                    attr = new ArrayList<Attr>();
                }
                return this.attr;
            }

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * ��ȡformat���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * ����format���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * ��ȡalias���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlias() {
                return alias;
            }

            /**
             * ����alias���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlias(String value) {
                this.alias = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="formatRule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
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

                /**
                 * ��ȡname���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * ����name���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * ��ȡtype���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * ����type���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * ��ȡformat���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * ����format���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * ��ȡformatRule���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormatRule() {
                    return formatRule;
                }

                /**
                 * ����formatRule���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormatRule(String value) {
                    this.formatRule = value;
                }

            }

        }

    }

}
