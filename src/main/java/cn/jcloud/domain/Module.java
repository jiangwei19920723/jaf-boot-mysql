package cn.jcloud.domain;


import org.springframework.http.HttpStatus;

import cn.jcloud.constent.ErrorCode;
import cn.jcloud.exception.JafException;
import cn.jcloud.exception.JafI18NException;
import cn.jcloud.util.I18NUtil;

/**
 * 模块
 * Created by Wei Han on 2016/2/15.
 */
public class Module {

    private String code;
    private String i18nModuleCode;

    public Module(String code) {
        this.code = code;
        this.i18nModuleCode = "module.code." + code;
    }

    public String getCode() {
        return code;
    }

    public String getI18nModuleCode() {
        return i18nModuleCode;
    }

    /**
     * 自动根据当前环境获取i18n的模块名称
     */
    public String getModuleName() {
        return I18NUtil.getDefaultI18NMsg(this.i18nModuleCode, this.code);
    }

    public JafException notFound() {
        String errorCode = ErrorCode.PREFIX + this.code + "_NOT_FOUND";
        return JafI18NException.of(errorCode, "module.not.found", HttpStatus.NOT_FOUND, i18nModuleCode);
    }

    public JafException notFound(String message) {
        String errorCode = ErrorCode.PREFIX + this.code + "_NOT_FOUND";
        return JafI18NException.of(errorCode, message, HttpStatus.NOT_FOUND);
    }

    public JafException existed() {
        String errorCode = ErrorCode.PREFIX + this.code + "_EXISTED";
        return JafI18NException.of(errorCode, "module.existed", HttpStatus.CONFLICT, i18nModuleCode);
    }

    /**
     * 名称已存在
     *
     * @param value 名称
     * @return 相应的异常
     */
    public JafException nameExisted(String value) {
        String errorCode = ErrorCode.PREFIX + this.code + "_NAME_EXISTED";
        return JafI18NException.of(errorCode, "module.name.existed", HttpStatus.CONFLICT, i18nModuleCode, value);
    }

    /**
     * 被关联
     *
     * @param module2 被关联的模块
     * @return 相应的异常
     */
    public JafException associatedWith(Module module2) {
        String errorCode = ErrorCode.PREFIX + this.code + "_ASSOCIATED_WITH_" + module2.code;
        return JafI18NException.of(errorCode, "module.associated.with.module2",
                HttpStatus.NOT_ACCEPTABLE, i18nModuleCode, module2.i18nModuleCode);
    }

    public JafException nullId() {
        return JafI18NException.of("module.null.id", ErrorCode.INVALID_ARGUMENT, i18nModuleCode);
    }
}
