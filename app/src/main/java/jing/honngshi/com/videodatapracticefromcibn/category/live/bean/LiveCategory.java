package jing.honngshi.com.videodatapracticefromcibn.category.live.bean;

/**
 * Created by JIngYuchun on 2017/11/26.
 */

public class LiveCategory {

    /**
     * id : 4
     * name : 全民星秀
     * is_default : 1
     * sort : 999
     * icon_gray : http://uimg.quanmin.tv/1480649995/48e55.png
     * icon_red : http://uimg.quanmin.tv/1480650000/64cf4.png
     * icon_image : http://uimg.quanmin.tv/1480650006/e9cbb.png
     * slug : beauty
     * type : 2
     * screen : 0
     */

    private int id;
    private String name;
    private int is_default;
    private int sort;
    private String icon_gray;
    private String icon_red;
    private String icon_image;
    private String slug;
    private int type;
    private int screen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIs_default() {
        return is_default;
    }

    public void setIs_default(int is_default) {
        this.is_default = is_default;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getIcon_gray() {
        return icon_gray;
    }

    public void setIcon_gray(String icon_gray) {
        this.icon_gray = icon_gray;
    }

    public String getIcon_red() {
        return icon_red;
    }

    public void setIcon_red(String icon_red) {
        this.icon_red = icon_red;
    }

    public String getIcon_image() {
        return icon_image;
    }

    public void setIcon_image(String icon_image) {
        this.icon_image = icon_image;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }
}
