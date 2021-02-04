package com.lu;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExOption extends Option implements Serializable {

    /**
     * default Value of code {@link Option#getCode()}
     * provide the default value from a collection via the system suggest
     */
    Boolean defaultVal;

    String extraMsg;
}
