package com.uzeyirdemiral.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

    private MessageType messageType;
    private String ofStatic;

    public ErrorMessage(MessageType messageType) {
    }

    public String prepareErrorMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append(messageType.getMessage());
        if (this.ofStatic != null) {
            builder.append(" : " + ofStatic);
        }
        return builder.toString();

    }
}
