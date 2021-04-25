package puzzles.object;

/**
 * 描述一个六边形
 *
 * @author liupu
 */
public class SixObject {
    /**
     * 两种类型: true -> 顶点朝上; false -> 边线朝上
     */
    private boolean flag;

    /**
     * 面心(中心点)
     */
    private Point center;

    /**
     * 顶点
     */
    private Point[] points;

    /**
     * 生成一个默认的六边形(平的)
     * @param center
     */
    public SixObject(Point center) {
        this.flag = false;
        this.center = center;
        points = new Point[6];
    }

    /**
     * 生成一个竖的六边形
     * @param center
     * @param flag
     */
    public SixObject(Point center, boolean flag) {
        this.flag = true;
        this.center = center;
        points = new Point[6];
    }

    public Point getCenter() {
        return center;
    }

    public Point[] getPoints() {
        return points;
    }

}
