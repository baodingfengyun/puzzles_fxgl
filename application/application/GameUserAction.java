package application;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.input.UserAction;

/**
 * 游戏玩家行为
 *
 * @author liupu
 */
public class GameUserAction {

    private Entity player;

    public GameUserAction(Entity player) {
        this.player = player;
    }

    public UserAction doMoveRight(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.translateX(5); // move right 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }

    public UserAction doMoveLeft(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.translateX(-5); // move left 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }

    public UserAction doMoveUp(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.translateY(-5); // move up 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }

    public UserAction doMoveDown(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.translateY(5); // move down 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }
}
