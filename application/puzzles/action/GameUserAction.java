package puzzles.action;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.input.UserAction;
import puzzles.object.GameObject;

/**
 * 游戏玩家行为
 *
 * @author liupu
 */
public class GameUserAction {

    /**
     * 玩家对象
     */
    private GameObject player;

    public GameUserAction(GameObject player) {
        this.player = player;
    }

    public UserAction doMoveRight(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.getEntity().translateX(5); // move right 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }

    public UserAction doMoveLeft(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.getEntity().translateX(-5); // move left 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }

    public UserAction doMoveUp(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.getEntity().translateY(-5); // move up 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }

    public UserAction doMoveDown(String name) {
        return new UserAction(name) {
            @Override
            protected void onAction() {
                player.getEntity().translateY(5); // move down 5 pixels
                FXGL.getWorldProperties().increment("pixelsMoved", +5);
            }
        };
    }
}
