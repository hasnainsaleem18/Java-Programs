import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Registration extends JFrame{
    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtFather;
    private JComboBox cbGender;
    private JTextField txtContact;
    private JTextField txtRollNo;
    private JTextField txtEmail;
    private JTextArea txtAddress;
    private JButton btSubmit;

    public Registration(){
        setContentPane(contentPane);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setTitle("Student's Registration");
        setLocationRelativeTo(null);
        setVisible(true);
        btSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectInfo();
            }
        });
        txtRollNo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if(txtRollNo.getText().isEmpty())
                    txtEmail.setText("");
                else{
                    String rollno = txtRollNo.getText();
                    String []r = rollno.toUpperCase().split("P-");
                    String email = "p"+r[0]+r[1]+"@pwr.nu.edu.pk";
                    txtEmail.setText(email);
                }
            }
        });
    }

    void collectInfo(){
        String name = txtName.getText();
        String father = txtFather.getText();
        String gender = cbGender.getSelectedItem().toString();
        String contact = txtContact.getText();
        String rollno = txtRollNo.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();

        JOptionPane.showMessageDialog(contentPane, "Name: "+name+"\nFather's Name: "+father+"\nGender: "+gender);
        //System.out.println("Name: "+name+"\nFather's Name: "+father+"\nGender: "+gender);
    }

    public static void main(String[] args){
        Registration r = new Registration();
    }
}
