package com.github.wubuku.sui.bean;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * From TypeScript definition:
 * <p>
 * <pre>
 * export type SuiData = { dataType: ObjectType } & (
 *   | SuiMoveObject
 *   | SuiMovePackage
 * );
 * </pre>
 */
@JsonDeserialize(using = SuiDataDeserializer.class)
public interface SuiData {
    ObjectType getDataType();

    class SuiMoveObject extends com.github.wubuku.sui.bean.SuiMoveObject implements SuiData {
        private ObjectType dataType;

        public SuiMoveObject() {
        }

        public SuiMoveObject(String type,
                             ObjectContentFields fields,
                             Boolean hasPublicTransfer,
                             ObjectType dataType) {
            super(type, fields, hasPublicTransfer);
            this.dataType = dataType;
        }

        @Override
        public ObjectType getDataType() {
            return dataType;
        }

        public void setDataType(ObjectType dataType) {
            this.dataType = dataType;
        }

        @Override
        public String toString() {
            return "SuiMoveObject{" +
                    "dataType=" + dataType +
                    ", type='" + getType() + '\'' +
                    ", fields=" + getFields() +
                    ", hasPublicTransfer=" + getHasPublicTransfer() +
                    '}';
        }
    }

    class SuiMovePackage extends com.github.wubuku.sui.bean.SuiMovePackage implements SuiData {
        private ObjectType dataType;

        public SuiMovePackage() {
        }

        public SuiMovePackage(MovePackageContent disassembled, ObjectType dataType) {
            super(disassembled);
            this.dataType = dataType;
        }

        @Override
        public ObjectType getDataType() {
            return dataType;
        }

        public void setDataType(ObjectType dataType) {
            this.dataType = dataType;
        }

        @Override
        public String toString() {
            return "SuiMovePackage{" +
                    "dataType=" + dataType +
                    ", disassembled=" + getDisassembled() +
                    '}';
        }
    }
}
