import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditorGui extends JFrame {
   
   public JLabel blank;
   
   public EditorGui() {
      super();
      setSize(1200, 800);
      setTitle("Editor Gui");
      addWindowListener(new WindowDestroyer(this));
      Container contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());
      
      JPanel textPanel = new JPanel();
      contentPane.add(textPanel, BorderLayout.CENTER);
      textPanel.setLayout(new GridLayout(5,1));
      blank = new JLabel("abcdefgh");
      textPanel.add(blank);
      textPanel.add(new JLabel(" Type your text here: "));
      textPanel.add(new JTextField(60));
      textPanel.add(new JLabel(" Modified Text: "));
      textPanel.add(new JTextField(60));
      
      JPanel buttonPanel = new JPanel();
      contentPane.add(buttonPanel, BorderLayout.SOUTH);
      buttonPanel.add(new JButton("Check Spelling"));
      buttonPanel.add(new JButton("Translate"));
      
      JMenuBar mBar = new JMenuBar();
      setJMenuBar(mBar);   
      JMenu shapeMenu = new JMenu("Languages");
      mBar.add(shapeMenu);   
      JMenuItem item;
      item = new JMenuItem("English to Spanish");
      shapeMenu.add(item);
      item = new JMenuItem("Spanish to English");
      shapeMenu.add(item);
   }
   
   public static void main(String args[]) {
      EditorGui gui = new EditorGui();
      gui.setVisible(true);
   }
}