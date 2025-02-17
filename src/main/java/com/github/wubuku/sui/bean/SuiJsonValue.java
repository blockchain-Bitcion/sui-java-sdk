package com.github.wubuku.sui.bean;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * From TypeScript definition:
 * <p>
 * <pre>
 * export type SuiJsonValue = boolean | number | string | Array<SuiJsonValue>;
 * </pre>
 */
@JsonDeserialize(using = SuiJsonValueDeserializer.class)
@JsonSerialize(using = SuiJsonValueSerializer.class)
public interface SuiJsonValue {

    class Boolean_ implements SuiJsonValue {
        private boolean value;

        public Boolean_() {
        }

        public Boolean_(boolean value) {
            this.value = value;
        }

        public boolean getValue() {
            return value;
        }

        public void setValue(boolean value) {
            this.value = value;
        }

        @Override
        public java.lang.String toString() {
            return "Boolean{" +
                    "value=" + value +
                    '}';
        }
    }

    class Number implements SuiJsonValue {
        private Long value;

        public Number() {
        }

        public Number(Long value) {
            this.value = value;
        }

        public Long getValue() {
            return value;
        }

        public void setValue(Long value) {
            this.value = value;
        }

        @Override
        public java.lang.String toString() {
            return "Number{" +
                    "value=" + value +
                    '}';
        }
    }

    class String_ implements SuiJsonValue {
        private java.lang.String value;

        public String_() {
        }

        public String_(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String getValue() {
            return value;
        }

        public void setValue(java.lang.String value) {
            this.value = value;
        }

        @Override
        public java.lang.String toString() {
            return "String{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    class Array implements SuiJsonValue {
        private SuiJsonValue[] values;

        public Array() {
        }

        public Array(SuiJsonValue[] values) {
            this.values = values;
        }

        public SuiJsonValue[] getValues() {
            return values;
        }

        public void setValues(SuiJsonValue[] values) {
            this.values = values;
        }

        @Override
        public java.lang.String toString() {
            return "Array{" +
                    "values=" + java.util.Arrays.toString(values) +
                    '}';
        }
    }

}
