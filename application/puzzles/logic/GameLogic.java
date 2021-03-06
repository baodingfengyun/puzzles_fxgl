package puzzles.logic;

import puzzles.object.GameObject;
import puzzles.action.GameUserAction;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.logging.Logger;
import javafx.scene.input.KeyCode;

/**
 * 游戏主要逻辑
 */
public class GameLogic {
    private static final Logger log = Logger.get(GameLogic.class);

    /**
     * 玩家对象
     */
    private GameObject player;
    /**
     * 行为对象
     */
    private GameUserAction userAction;
    /**
     * 刷新帧数
     */
    private long frameCounter;

    public GameLogic() {
        player = new GameObject();
        userAction = new GameUserAction(player);
        frameCounter = 0L;
    }

    public void registerKeyAndAction(Input input) {
        input.addAction(userAction.doMoveRight("Right1"), KeyCode.D);
        input.addAction(userAction.doMoveRight("Right2"), KeyCode.RIGHT);

        input.addAction(userAction.doMoveLeft("Left1"), KeyCode.A);
        input.addAction(userAction.doMoveLeft("Left2"), KeyCode.LEFT);

        input.addAction(userAction.doMoveUp("Up1"), KeyCode.W);
        input.addAction(userAction.doMoveUp("Up2"), KeyCode.UP);

        input.addAction(userAction.doMoveDown("Down1"), KeyCode.S);
        input.addAction(userAction.doMoveDown("Down2"), KeyCode.DOWN);
    }

    public void tick() {
        frameCounter++;
        if (frameCounter % 100 == 0) {
            log.info("counter:" + frameCounter);
        }
    }
}
