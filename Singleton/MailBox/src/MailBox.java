public class MailBox {

    private String mailBoxPosition;
    private String titlePosition;
    private String contentsPosition;

    private float mailBoxHeight;
    private float mailBoxWidth;
    private float titleHeight;
    private float titleWidth;
    private float contentsHeight;
    private float contentsWidth;

    public MailBox() {
    }

    public MailBox(String mailBoxPosition, String titlePosition, String contentsPosition, float mailBoxHeight, float mailBoxWidth,
                   float titleHeight, float titleWidth, float contentsHeight, float contentsWidth) {
        this.mailBoxPosition = mailBoxPosition;
        this.titlePosition = titlePosition;
        this.contentsPosition = contentsPosition;
        this.mailBoxHeight = mailBoxHeight;
        this.mailBoxWidth = mailBoxWidth;
        this.titleHeight = titleHeight;
        this.titleWidth = titleWidth;
        this.contentsHeight = contentsHeight;
        this.contentsWidth = contentsWidth;
    }

    public String getMailBoxPosition() {
        return mailBoxPosition;
    }

    public void setMailBoxPosition(String mailBoxPosition) {
        this.mailBoxPosition = mailBoxPosition;
    }

    public String getTitlePosition() {
        return titlePosition;
    }

    public void setTitlePosition(String titlePosition) {
        this.titlePosition = titlePosition;
    }

    public String getContentsPosition() {
        return contentsPosition;
    }

    public void setContentsPosition(String contentsPosition) {
        this.contentsPosition = contentsPosition;
    }

    public float getMailBoxHeight() {
        return mailBoxHeight;
    }

    public void setMailBoxHeight(float mailBoxHeight) {
        this.mailBoxHeight = mailBoxHeight;
    }

    public float getMailBoxWidth() {
        return mailBoxWidth;
    }

    public void setMailBoxWidth(float mailBoxWidth) {
        this.mailBoxWidth = mailBoxWidth;
    }

    public float getTitleHeight() {
        return titleHeight;
    }

    public void setTitleHeight(float titleHeight) {
        this.titleHeight = titleHeight;
    }

    public float getTitleWidth() {
        return titleWidth;
    }

    public void setTitleWidth(float titleWidth) {
        this.titleWidth = titleWidth;
    }

    public float getContentsHeight() {
        return contentsHeight;
    }

    public void setContentsHeight(float contentsHeight) {
        this.contentsHeight = contentsHeight;
    }

    public float getContentsWidth() {
        return contentsWidth;
    }

    public void setContentsWidth(float contentsWidth) {
        this.contentsWidth = contentsWidth;
    }

}