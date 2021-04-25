package puzzles.utils;

import puzzles.object.Point;
import puzzles.object.SixObject;

/**
 * 六边形相关的工具类
 *
 * @author liupu
 */
public class SixUtils {

    public static Point hexCorner(Point center, int size, int i) {
        var angleDeg = 60 * i + 30;
        var angleRad = Math.PI / 180 * angleDeg;
        double x = center.getX() + size * Math.cos(angleRad);
        double y = center.getY() + size * Math.sin(angleRad);
        return new Point(x, y);
    }

    /**
     * 生成六边形
     * @param center 面心点
     * @param size 边长
     * @return 六边形数据结构
     */
    public static SixObject createSixObject(Point center, int size) {
        SixObject six = new SixObject(center);
        for (int i = 0; i < 6; i++) {
            six.getPoints()[i] = hexCorner(center, size, i);
        }
        return six;
    }

    public static void main(String[] args) {
        Point center = new Point(0, 0);
        for (int i = 0; i <= 5; i++) {
            System.out.println(hexCorner(center, 10, i));
        }
    }
}
