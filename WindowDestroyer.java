import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowDestroyer extends WindowAdapter {
   
   EditorGui gui;
   int countClose = 0;
   
   public WindowDestroyer(EditorGui editorGui) {
      super();
      gui = editorGui;
   }
   
   public void windowClosing(WindowEvent e) {
      if (countClose >= 2) System.exit(0);
      if (countClose == 0) gui.blank.setText(" Are you sure!");
      if (countClose == 1) gui.blank.setText(" Are you really sure!");
      gui.blank.setForeground(Color.RED);
      countClose++;
      throw new RuntimeException();
   }
}