import assessments.AssessmentFeed;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){



        class Students {
            private String name;
            private String cid;
            private String type;

            public Students(String name, String cid, String type){
                this.name = name;
                this.cid = cid;
                this.type = type;
            }
            public String getName() { return name; }
            public String getCID() { return cid; }
            public String getType() { return type; }
        }

        String Aname = assessments.AssessmentFeed.getStudentName("10021");
        String Atype = assessments.AssessmentFeed.getStudentType("10021");
        Students StudentA = new Students(Aname, "10021", Atype);
        double ATest = 0.0;
        if(1.0 == assessments.AssessmentFeed.getResult("10021", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.EXPLAINED_SUCCESSFULLY)) {
            ATest = assessments.AssessmentFeed.getResult("10021", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        } else{
            ATest = 0.4 * AssessmentFeed.getResult("10021", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        }
        double AProject = 0.4 * AssessmentFeed.getResult("10021", AssessmentFeed.AI_PROJECT, AssessmentFeed.FUNCTIONALITY_MARK) + 0.6 * AssessmentFeed.getResult("10021", AssessmentFeed.AI_PROJECT, AssessmentFeed.VERIFICATION_MARK);
        double AMark = 0.3 * ATest + 0.7 * AProject;

        String Bname = assessments.AssessmentFeed.getStudentName("10022");
        String Btype = assessments.AssessmentFeed.getStudentType("10022");
        Students StudentB = new Students(Bname, "10022", Btype);
        double BTest = 0.0;
        if(1.0 == assessments.AssessmentFeed.getResult("10022", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.EXPLAINED_SUCCESSFULLY)) {
            BTest = assessments.AssessmentFeed.getResult("10022", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        } else{
            BTest = 0.4 * AssessmentFeed.getResult("10022", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        }
        double BProject = 0.4 * AssessmentFeed.getResult("10022", AssessmentFeed.AI_PROJECT, AssessmentFeed.FUNCTIONALITY_MARK) + 0.6 * AssessmentFeed.getResult("10022", AssessmentFeed.AI_PROJECT, AssessmentFeed.VERIFICATION_MARK);
        double BViva = 0.5 * AssessmentFeed.getResult("10022", AssessmentFeed.DESIGN_VIVA, AssessmentFeed.DESIGN_MARK) + 0.5 * AssessmentFeed.getResult("10022", AssessmentFeed.DESIGN_VIVA, AssessmentFeed.EXPLANATION_MARK);
        double BMark = 0.25 * BTest + 0.45 * BProject + 0.3 * BViva;

        String Cname = assessments.AssessmentFeed.getStudentName("10023");
        String Ctype = assessments.AssessmentFeed.getStudentType("10023");
        Students StudentC = new Students(Cname, "10023", Ctype);
        double CTest = 0.0;
        if(1.0 == assessments.AssessmentFeed.getResult("10023", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.EXPLAINED_SUCCESSFULLY)) {
            CTest = assessments.AssessmentFeed.getResult("10023", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        } else{
            CTest = 0.4 * AssessmentFeed.getResult("10023", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        }
        double CProject = 0.4 * AssessmentFeed.getResult("10023", AssessmentFeed.AI_PROJECT, AssessmentFeed.FUNCTIONALITY_MARK) + 0.6 * AssessmentFeed.getResult("10023", AssessmentFeed.AI_PROJECT, AssessmentFeed.VERIFICATION_MARK);
        double CViva = 0.5 * AssessmentFeed.getResult("10023", AssessmentFeed.DESIGN_VIVA, AssessmentFeed.DESIGN_MARK) + 0.5 * AssessmentFeed.getResult("10023", AssessmentFeed.DESIGN_VIVA, AssessmentFeed.EXPLANATION_MARK);
        double CMark = 0.25 * CTest + 0.45 * CProject + 0.3 * CViva;

        String Dname = assessments.AssessmentFeed.getStudentName("10024");
        String Dtype = assessments.AssessmentFeed.getStudentType("10024");
        Students StudentD = new Students(Dname, "10024", Dtype);
        double DTest = 0.0;
        if(1.0 == assessments.AssessmentFeed.getResult("10024", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.EXPLAINED_SUCCESSFULLY)) {
            DTest = assessments.AssessmentFeed.getResult("10024", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        } else{
            DTest = 0.4 * AssessmentFeed.getResult("10024", AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.PROGRAM_MARK);
        }
        double DProject = 0.4 * AssessmentFeed.getResult("10024", AssessmentFeed.AI_PROJECT, AssessmentFeed.FUNCTIONALITY_MARK) + 0.6 * AssessmentFeed.getResult("10024", AssessmentFeed.AI_PROJECT, AssessmentFeed.VERIFICATION_MARK);
        double DMark = 0.3 * DTest + 0.7 * DProject;



        JFrame frame = new JFrame("Marking System");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 4, 10, 10));

        JLabel ALabel = new JLabel("Student A");
        JPanel APanel = new JPanel();
        APanel.add(ALabel);
        ALabel.setText(
                "<html>Record<br>" +
                        "Name: " + Aname + "<br>" +
                        "CID: " +  StudentA.getCID() + "<br>" +
                        "Student Type: " + Atype + "<br>" +
                        "Programming Test Mark:" + ATest + "<br>" +
                        "Programming Project Mark:" + AProject + "<br>" +
                        "Final Mark:" + AMark +  "%<br>" +
                        "</html>"
        );

        if (AProject - 20 >= ATest){
            APanel.setBackground(Color.RED);
        } else{
            APanel.setBackground(Color.WHITE);
        }

        JLabel BLabel = new JLabel("Student B");
        JPanel BPanel = new JPanel();
        BPanel.add(BLabel);
        BLabel.setText(
                "<html>Record<br>" +
                        "Name: " + Bname + "<br>" +
                        "CID: " +  StudentB.getCID() + "<br>" +
                        "Student Type: " + Btype + "<br>" +
                        "Programming Test Mark:" + BTest + "<br>" +
                        "Programming Project Mark:" + BProject + "<br>" +
                        "Software Design Viva Mark:" + BViva + "<br>" +
                        "Final Mark:" + BMark +  "%<br>" +
                        "</html>"
        );

        if (BProject - 20 >= BTest || BProject - 20 >= BViva){
            BPanel.setBackground(Color.RED);
        } else{
            BPanel.setBackground(Color.WHITE);
        }

        JLabel CLabel = new JLabel("Student C");
        JPanel CPanel = new JPanel();
        CPanel.add(CLabel);
        CLabel.setText(
                "<html>Record<br>" +
                        "Name: " + Cname + "<br>" +
                        "CID: " +  StudentC.getCID() + "<br>" +
                        "Student Type: " + Ctype + "<br>" +
                        "Programming Test Mark:" + CTest + "<br>" +
                        "Programming Project Mark:" + CProject + "<br>" +
                        "Software Design Viva Mark:" + CViva + "<br>" +
                        "Final Mark:" + CMark +  "%<br>" +
                        "</html>"
        );
        if (CProject - 20 >= CTest || CProject - 20 >= CViva){
            CPanel.setBackground(Color.RED);
        } else{
            CPanel.setBackground(Color.WHITE);
        }

        JLabel DLabel = new JLabel("Student D");
        JPanel DPanel = new JPanel();
        DPanel.add(DLabel);
        DLabel.setText(
                "<html>Record<br>" +
                        "Name: " + Dname + "<br>" +
                        "CID: " +  StudentD.getCID() + "<br>" +
                        "Student Type: " + Dtype + "<br>" +
                        "Programming Test Mark:" + DTest + "<br>" +
                        "Programming Project Mark:" + DProject + "<br>" +
                        "Final Mark:" + DMark +  "%<br>" +
                        "</html>"
        );

        if (DProject - 20 >= DTest){
            DPanel.setBackground(Color.RED);
        } else{
            DPanel.setBackground(Color.WHITE);
        }

        mainPanel.add(APanel);
        mainPanel.add(BPanel);
        mainPanel.add(CPanel);
        mainPanel.add(DPanel);
        frame.add(mainPanel);
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
