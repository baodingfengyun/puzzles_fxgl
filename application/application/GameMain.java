package application;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.logging.Logger;
import javafx.scene.text.Text;
import puzzles.logic.GameLogic;

import java.util.Map;

/**
 * 游戏入口(启动点)
 *
 * @author liupu
 */
public class GameMain extends GameApplication {
  private static final Logger log = Logger.get(GameMain.class);

  /**
   * 游戏逻辑
   */
  private GameLogic logic;

  /**
   * 第一个被回调的,设置窗口宽高,标题,版本
   * @param settings 设置对象
   */
  @Override
  protected void initSettings(GameSettings settings) {
    System.out.println("-------> initSettings");
    settings.setWidth(800);
    settings.setHeight(600);
    settings.setTitle("谜题游戏");
    settings.setVersion("0.1");
//    settings.setManualResizeEnabled(false);
    // 播放介绍(FXGL+JavaFX)
//    settings.setIntroEnabled(true);
    // 主菜单
//    settings.setMainMenuEnabled(true);
    // 游戏菜单
//    settings.setGameMenuEnabled(true);
    // 玩家属性
//    settings.setUserProfileEnabled(true);
  }

  // 第二个被回调的
  @Override
  protected void initInput() {
    System.out.println("-------> initInput");
  }

  // 第三个被回调的
  @Override
  protected void initGameVars(Map<String, Object> vars) {
    System.out.println("-------> initGameVars");
    vars.put("pixelsMoved", 0);
  }

  // 第四个被回调的
  @Override
  protected void initGame() {
    System.out.println("-------> initGame");

    this.logic = new GameLogic();
    Input input = FXGL.getInput();
    this.logic.registerKeyAndAction(input);

  }

  // 第五个被回调的
  @Override
  protected void initUI() {
    System.out.println("-------> initUI");
    Text textPixels = new Text();
    textPixels.setTranslateX(50); // x = 50
    textPixels.setTranslateY(100); // y = 100

    textPixels.textProperty().bind(FXGL.getWorldProperties().intProperty("pixelsMoved").asString());

    FXGL.getGameScene().addUINode(textPixels); // add to the scene graph
  }

  @Override
  protected void onUpdate(double tpf) {
    this.logic.tick();
  }

  public static void main(String[] args) {
    // 启动
    System.out.println("-------> Start to run.");
    launch(args);
  }
}
