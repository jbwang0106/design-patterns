package com.suidyi.design.prototype;

import lombok.Data;

/**
 * @author jbwang0106
 */
@Data
public class Mail implements Cloneable {

    /**
     * 收件人
     */
    private String receiver;

    /**
     * 邮件名称
     */
    private String subject;

    /**
     * 称谓
     */
    private String appellation;

    /**
     * 内容
     */
    private String context;

    /**
     * 尾部
     */
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mail;
    }
}
