import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;


  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
	  frame.setSize(200,110);

    JButton left = new JButton("Left");
	  JButton right = new JButton("Right");

    //Initialize your two int instance variables to 0

    leftCount = 0;
    rightCount = 0;

    //Add an actionListener to the left/right button

    left.addActionListener(this);
	  right.addActionListener(this);

    //Add the left and right buttons to the frame
    frame.add(left);
	  frame.add(right);

    leftLabel = new JLabel("Count: " + leftCount);
    rightLabel = new JLabel("Count: " + rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    //reset button

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    //set frame to be visible
    frame.setVisible(true);



  }


public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left")) {
    leftCount ++;
    leftLabel.setText("Count: " + leftCount);
  }
  else if(ae.getActionCommand().equals("Right")) {
    rightCount ++;
    rightLabel.setText("Count: " + rightCount);
  }

  else {
    leftCount = 0;
    rightCount = 0;
    leftLabel.setText("Count: " + leftCount);
    rightLabel.setText("Count: " + rightCount);
  }

}
}
