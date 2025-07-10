package com.uzeyirdemiral.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("1004", "kayıt bulunamadı"),
    GENERAL_EXCEPTION("9999","genel bir hata oluştu");


    private String code;
    private String message;

    MessageType(String code, String messagee) {
        this.code = code;
        this.message = messagee;
    }
    }
