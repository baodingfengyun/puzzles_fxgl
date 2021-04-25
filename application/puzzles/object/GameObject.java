package puzzles.object;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * 玩家对象,包含实体
 */
public class GameObject {

    /**
     * 实体
     */
    private Entity entity;

    public GameObject() {
        entity = FXGL.entityBuilder()
                .at(300, 300)
                .view(new Rectangle(25, 25, Color.BLUE))
                .buildAndAttach();
    }

    public Entity getEntity() {
        return this.entity;
    }


}
