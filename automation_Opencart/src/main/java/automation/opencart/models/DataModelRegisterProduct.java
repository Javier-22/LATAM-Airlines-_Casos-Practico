package automation.opencart.models;
public class DataModelRegisterProduct {
    private String strProducName;
    private String strDescription;
    private String strMetaTagTitle;

    public String getStrProducName() {
        return strProducName;
    }

    public void setStrProducName(String strProducName) {
        this.strProducName = strProducName;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    public String getStrMetaTagTitle() {
        return strMetaTagTitle;
    }

    public void setStrMetaTagTitle(String strMetaTagTitle) {
        this.strMetaTagTitle = strMetaTagTitle;
    }

    public String getStrMetaTagDescription() {
        return strMetaTagDescription;
    }

    public void setStrMetaTagDescription(String strMetaTagDescription) {
        this.strMetaTagDescription = strMetaTagDescription;
    }

    public String getStrMetaTagKeywords() {
        return strMetaTagKeywords;
    }

    public void setStrMetaTagKeywords(String strMetaTagKeywords) {
        this.strMetaTagKeywords = strMetaTagKeywords;
    }

    public String getStrProductTags() {
        return strProductTags;
    }

    public void setStrProductTags(String strProductTags) {
        this.strProductTags = strProductTags;
    }

    private String strMetaTagDescription;
    private String strMetaTagKeywords;
    private String strProductTags;
}
