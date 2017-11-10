import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Lab09 extends Frame {

    Lab09(String s) {
        super(s);
        //setLayout(null);
    }

    public static void main(String[] args) {
        Panel northPanel = new Panel();
        Panel eastPanel = new Panel();

        //for northPanel
        Button button1 = new Button("Button1");
        Canvas canvas1 = new Canvas();
        Checkbox checkbox1 = new Checkbox();
        Choice choice1 = new Choice();
        Container container1 = new Container();
        button1.setBackground(Color.blue);
        canvas1.setBackground(Color.green);
        checkbox1.setBackground(Color.GRAY);
        choice1.setBackground(Color.MAGENTA);
        container1.setBackground(Color.RED);

        //for eastPanel
        Label label1 = new Label();
        List list1 = new List();
        Scrollbar scrollbar1 = new Scrollbar();
        TextArea textArea1 = new TextArea("TextArea example");
        TextField textField1 = new TextField("TextField example");
        label1.setBackground(Color.BLACK);
        list1.setBackground(Color.CYAN);
        scrollbar1.setBackground(Color.LIGHT_GRAY);

        MenuBar menuBar1 = new MenuBar();
        Menu menu1 = new Menu("Menu");
        PopupMenu popupMenu1 = new PopupMenu("Popupmenu");
        MenuItem menuItem1 = new MenuItem("menuitem");
        CheckboxMenuItem checkboxMenuItem1 = new CheckboxMenuItem();
        menuBar1.add(menu1);
        menuBar1.add(popupMenu1);
        menu1.add(menuItem1);
        menu1.add(checkboxMenuItem1);

        Frame f = new Lab09("ЛР№9:Принципи побудови графічного інтерфейса");
        f.add(northPanel, BorderLayout.NORTH);
        f.add(eastPanel,BorderLayout.EAST);
        f.setMenuBar(menuBar1);

        northPanel.add(button1, BorderLayout.WEST);
        northPanel.add(canvas1).setSize(200, 200);
        northPanel.add(checkbox1, BorderLayout.WEST);
        northPanel.add(choice1, BorderLayout.EAST);
        northPanel.add(container1, BorderLayout.CENTER);

        eastPanel.add(label1,BorderLayout.EAST);
        eastPanel.add(list1, BorderLayout.CENTER);
        eastPanel.add(scrollbar1, BorderLayout.WEST);
        eastPanel.add(textArea1);
        eastPanel.add(textField1);


        f.setSize(700, 800);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
}