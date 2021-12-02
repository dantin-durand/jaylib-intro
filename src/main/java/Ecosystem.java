import static com.raylib.Jaylib.RAYWHITE;
import static com.raylib.Raylib.*;

public class Ecosystem {
    public static void main(String args[]) {
        InitWindow(Jungle.JUNGLE_WIDTH, Jungle.JUNGLE_HEIGHT, "Jungle webstart");
        SetTargetFPS(60);

        while (!WindowShouldClose()) {
            ClearBackground(RAYWHITE);
            DrawFPS(20, 20);
            EndDrawing();
        }
        CloseWindow();
    }
}