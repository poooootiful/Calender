import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Calender  implements ActionListener {
    LocalDate today = LocalDate.now();

    String Month = today.getMonth().name();

    int Date = today.getDayOfMonth();

    int Weekday = today.getDayOfWeek().getValue();

    int MondayDate=Date;

    int TuesdayDate=Date;

    int WednesdayDate=Date;

    int ThursdayDate=Date;

    int FridayDate=Date;

    int SaturdayDate=Date;

    int SundayDate=Date;

    int mondayId = 1;

    int tuesdayId = 2;

    int wednesdayId = 3;

    int thursdayId = 4;

    int fridayId = 5;

    int saturdayId = 6;

    int sundayId = 7;

    private String [] EventButtons = {"Add to mon", "Add to tue", "Add to wed", "Add to thur", "Add to fri", "Add to sat", "Add to sun"};

    private JTextField MondayTextField;


    private JTextArea MondayTextArea;

    private JTextField TuesdayTextField;

    private JTextArea TuesdayTextArea;

    private JTextField WednesdayTextField;

    private JTextArea WednesdayTextArea;

    private JTextField ThursdayTextField;

    private JTextArea ThursdayTextArea;

    private JTextField FridayTextField;

    private JTextArea FridayTextArea;

    private JTextField SaturdayTextField;

    private JTextArea SaturdayTextArea;

    private JTextField SundayTextField;

    private JTextArea SundayTextArea;


    Calender (){

        //Sets all dates correct
        if (Weekday==mondayId) {
            Date = MondayDate;
            TuesdayDate = Date +1;
            WednesdayDate = Date +2;
            ThursdayDate = Date +3;
            FridayDate = Date +4;
            SaturdayDate = Date +5;
            SundayDate = Date +6;
        }

        if (Weekday==tuesdayId) {
            Date = TuesdayDate;
            MondayDate = Date-1;
            WednesdayDate = Date+1;
            ThursdayDate = Date+2;
            FridayDate = Date+3;
            SaturdayDate = Date+4;
            SundayDate = Date+5;
        }

        if (Weekday==wednesdayId) {
            Date = WednesdayDate;
            MondayDate = Date-2;
            TuesdayDate = Date-1;
            ThursdayDate = Date+1;
            FridayDate = Date+2;
            SaturdayDate = Date+3;
            SundayDate = Date+4;
        }

        if (Weekday==thursdayId) {
            Date=ThursdayDate;
            MondayDate = Date-3;
            TuesdayDate = Date-2;
            WednesdayDate = Date-1;
            FridayDate = Date+1;
            SaturdayDate = Date+2;
            SundayDate = Date+3;
        }

        if (Weekday==fridayId){
            Date = FridayDate;
            MondayDate = Date -4;
            TuesdayDate = Date -3;
            WednesdayDate = Date-2;
            ThursdayDate = Date-1;
            SaturdayDate = Date +1;
            SundayDate = Date +2;
        }

        if (Weekday==saturdayId) {
            Date=SaturdayDate;
            MondayDate = Date -5;
            TuesdayDate = Date -4;
            WednesdayDate = Date -3;
            ThursdayDate = Date -2;
            FridayDate = Date -1;
            SundayDate = Date +1;
        }

        if (Weekday==sundayId) {
            Date=SundayDate;
            MondayDate = Date -6;
            TuesdayDate = Date -5;
            WednesdayDate = Date -4;
            ThursdayDate = Date -3;
            FridayDate = Date -2;
            SaturdayDate = Date -1;
        }

        //Array of the current week dates
        int [] WeekDates = {MondayDate,TuesdayDate,WednesdayDate,ThursdayDate,FridayDate,SaturdayDate,SundayDate};

        //Start the Gui
        JFrame frame = new JFrame();
        frame.setSize(900,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,7));

        JPanel daysNames = new JPanel();
        JPanel Dates = new JPanel();
        JPanel Events = new JPanel();
        JPanel EventText = new JPanel();
        JPanel Buttons = new JPanel();

        frame.add(daysNames);
        frame.add(Dates);
        frame.add(Events);
        frame.add(EventText);
        frame.add(Buttons);

        //Monday Label
        JLabel Monday = new JLabel("Monday");
        Monday.setPreferredSize(new Dimension(120,20));
        daysNames.add(Monday);

        //Tuesday Label
        JLabel Tuesday = new JLabel("Tuesday");
        Tuesday.setPreferredSize(new Dimension(120,20));
        daysNames.add(Tuesday);

        //Wednesday Label
        JLabel Wednesday = new JLabel("Wednesday");
        Wednesday.setPreferredSize(new Dimension(120,20));
        daysNames.add(Wednesday);

        //Thursday Label
        JLabel Thursday = new JLabel("Thursday");
        Thursday.setPreferredSize(new Dimension(120,20));
        daysNames.add(Thursday);

        //Friday Label
        JLabel Friday = new JLabel("Friday");
        Friday.setPreferredSize(new Dimension(120,20));
        daysNames.add(Friday);

        //Saturday Label
        JLabel Saturday = new JLabel("Saturday");
        Saturday.setPreferredSize(new Dimension(120,20));
        daysNames.add(Saturday);

        //Sunday Label
        JLabel Sunday = new JLabel("Sunday");
        Sunday.setPreferredSize(new Dimension(120,20));
        daysNames.add(Sunday);

        //The dates of the week (Currently only this week)
        for (int title: WeekDates) {
            JLabel WeekDate = new JLabel(Month+" "+title+"th"+" ");
            WeekDate.setPreferredSize(new Dimension(120,20));
            Dates.add(WeekDate);
        }

        //Text Areas
        MondayTextArea = new JTextArea();
        MondayTextArea.setPreferredSize(new Dimension(120,80));
        MondayTextArea.setEditable(false);
        EventText.add(MondayTextArea);

        TuesdayTextArea = new JTextArea();
        TuesdayTextArea.setPreferredSize(new Dimension(120,80));
        TuesdayTextArea.setEditable(false);
        EventText.add(TuesdayTextArea);

        WednesdayTextArea = new JTextArea();
        WednesdayTextArea.setPreferredSize(new Dimension(120,80));
        WednesdayTextArea.setEditable(false);
        EventText.add(WednesdayTextArea);

        ThursdayTextArea = new JTextArea();
        ThursdayTextArea.setPreferredSize(new Dimension(120,80));
        ThursdayTextArea.setEditable(false);
        EventText.add(ThursdayTextArea);

        FridayTextArea = new JTextArea();
        FridayTextArea .setPreferredSize(new Dimension(120,80));
        FridayTextArea.setEditable(false);
        EventText.add(FridayTextArea );

        SaturdayTextArea = new JTextArea();
        SaturdayTextArea.setPreferredSize(new Dimension(120,80));
        SaturdayTextArea.setEditable(false);
        EventText.add(SaturdayTextArea);

        SundayTextArea = new JTextArea();
        SundayTextArea.setPreferredSize(new Dimension(120,80));
        SundayTextArea.setEditable(false);
        EventText.add(SundayTextArea);


        //TextFields
        MondayTextField = new JTextField();
        MondayTextField.setPreferredSize(new Dimension(120,50));
        EventText.add(MondayTextField);

        TuesdayTextField = new JTextField();
        TuesdayTextField.setPreferredSize(new Dimension(120,50));
        EventText.add(TuesdayTextField);

        WednesdayTextField = new JTextField();
        WednesdayTextField.setPreferredSize(new Dimension(120,50));
        EventText.add(WednesdayTextField);

        ThursdayTextField = new JTextField();
        ThursdayTextField.setPreferredSize(new Dimension(120,50));
        EventText.add(ThursdayTextField);

        FridayTextField = new JTextField();
        FridayTextField.setPreferredSize(new Dimension(120,50));
        EventText.add(FridayTextField);

        SaturdayTextField = new JTextField();
        SaturdayTextField.setPreferredSize(new Dimension(120,50));
        EventText.add(SaturdayTextField);

        SundayTextField = new JTextField();
        SundayTextField.setPreferredSize(new Dimension(120,50));
        EventText.add(SundayTextField);

        for (String title:EventButtons) {
            JButton Button = new JButton(title);
            Button.setPreferredSize(new Dimension(120,20));
            Button.addActionListener(this);
            Buttons.add(Button);
        }


        //Checks the Current date against the weekday value
        if (Weekday == mondayId) {
            System.out.println("Monday");
            Monday.setText("It's Monday");
        }

        if (Weekday==tuesdayId) {
            System.out.println("Tuesday");
            Tuesday.setText("It's Tuesday");
        }

        if (Weekday == wednesdayId) {
            System.out.println("Wednesday");
            Wednesday.setText("It's Wednesday");
        }

        if (Weekday==thursdayId){
            System.out.println("Thursday");
            Thursday.setText("It's Thursday");
        }

        if (Weekday==fridayId) {
            System.out.println("Friday");
            Friday.setText("It's Friday Today");
        }

        if (Weekday==saturdayId) {
            System.out.println("Saturday");
            Saturday.setText("It's Saturday Today");
        }

        if (Weekday==sundayId) {
            System.out.println("Sunday");
            Sunday.setText("It's Sunday Today");
        }

        //Gui visibility
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        String MondayText;
        String TuesdayText;
        String WednesdayText;
        String ThursdayText;
        String FridayText;
        String SaturdayText;
        String SundayText;

        if (btn.matches("Add to mon")){
            MondayText = MondayTextField.getText();
            MondayTextArea.setText(MondayText);
        }

        if (btn.matches("Add to tue")) {
            TuesdayText = TuesdayTextField.getText();
            TuesdayTextArea.setText(TuesdayText);
        }

        if (btn.matches("Add to wed")){
            WednesdayText = WednesdayTextField.getText();
            WednesdayTextArea.setText(WednesdayText);
        }

        if (btn.matches("Add to thur")) {
            ThursdayText = ThursdayTextField.getText();
            ThursdayTextArea.setText(ThursdayText);
        }

        if (btn.matches("Add to fri")){
            FridayText = FridayTextField.getText();
            FridayTextArea.setText(FridayText);
        }

        if (btn.matches("Add to sat")) {
            SaturdayText = SaturdayTextField.getText();
            SaturdayTextArea.setText(SaturdayText);
        }

        if (btn.matches("Add to sun")){
            SundayText = SundayTextField.getText();
            SundayTextArea.setText(SundayText);

        }
    }
}
