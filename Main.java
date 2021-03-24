package com.sparta.AMalcolm;

public class Main {

    public static void main(String[] args) {

        SpartanTrainee trainee = new SpartanTrainee("Alasdair", "26 Polsloe Road", "07983258379");

        SpartanOnSite onSite = new SpartanOnSite("Alasdair1", "26 Polsloe Road", "07983258379");

        whileWaitingAssignment(trainee);
        whileWaitingAssignment(onSite);
    }

    private static void whileWaitingAssignment(Spartan spartan) {
        if(spartan instanceof SpartanTrainee) {
            System.out.printf("\n%s is a %s, their SpartanID is %s.\n", spartan.getSpartanName(), spartan.getClass().getSimpleName(), spartan.getSpartanId());
            System.out.printf("Their salary is: £%f.\n", spartan.getPay());
            System.out.printf("While waiting assignment they would be in pre-assignment period/training.\n");
        }
        else if (spartan instanceof SpartanOnSite) {
            System.out.printf("\n%s is a %s, their SpartanID is %s.\n", spartan.getSpartanName(), spartan.getClass().getSimpleName(), spartan.getSpartanId());
            System.out.printf("Their salary is: £%f.\n", spartan.getPay());
            System.out.printf("While waiting assignment they would be in bench.\n");
        }
    }
}