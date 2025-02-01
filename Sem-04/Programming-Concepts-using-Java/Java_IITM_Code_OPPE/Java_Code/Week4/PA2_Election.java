package Week4;

// // Both the Voter and EVM classes must be created in such a way that they enforce the existence of only a single instance at a time. Each Voter object must be mapped with a unique EVM object and vice versa. A Voter must be allocated an EVM and then the voting process should start, once voting is completed that particular EVM should be freed and the next voter should be called.
// // Again a new EVM must be allocated to the next voter like previously and the process continues till all the voters cast their votes.


//todo: did not understand this either.

import java.util.Scanner;

// class Voter {
//     public int total_no_of_voters;
//     private int current_voter_count;

//     // Define appropriate variables for implementing singleton behaviour
//     // in accordance with the given coded parts and sample output

//     private Voter() {
//         current_voter_count++;
//     }

//     public static Voter getVoter() {
//         // implement singleton behaviour
//         System.out.println("voting under process on EVM number 1");
//         System.out.println("Voting completed for voter 1");
//     }

//     public void firstVoter() {
//         if (new_voter != null) {
//             EVM new_machine = EVM.getEVM(new_voter);
//             new_machine.startVoting();
//         }
//     }

//     public void callNewVoter() {
//         // Write code to setup a new EVM object for the new voter

//         // Ignore the following 6 lines of code
//         // but do not delete this code in your submission
//         // ========================================================================
//         try {
//             EVM x = EVM.getEVM(null);
//             x.startVoting();
//         } catch (NullPointerException e) {
//             System.out.println("EVM is Singleton");
//         }
//         // ========================================================================
//         // Resume writing your code here

//         // Hint: Write code to start voting for the new user on the new EVM
//     }
// }

// class EVM {

//     // Define appropriate variables for implementing singleton behaviour
//     // in accordance with the given coded parts and sample output

//     private EVM(Voter v) {
//         current_voter = v;
//         evm_count++;
//     }

//     public static EVM getEVM(Voter v) {
//         // Implement singleton behaviour
//     }

//     public void startVoting() {
//         // Complete voting for the current voter and call the next voter
//         // Hint : Use callback here
//     }
// }

// public class PA2_Election {
//     public static void main(String args[]) {
//         Scanner s = new Scanner(System.in);
//         Voter.total_no_of_voters = s.nextInt();
//         // Assume input is always non zero
//         Voter v = Voter.getVoter();

//         // Trying to create another voter when one voter is in the middle of
//         // voting process, students can ignore this try-catch block of code

//         try {
//             Voter x = Voter.getVoter();
//             x.callNewVoter();
//         } catch (NullPointerException e) {
//             System.out.println("Voter is Singleton");
//         }

//         // Starting the first vote of the day
//         v.firstVoter();
//     }
// }

class Voter {
    // Define appropriate variables for implementing singleton behaviour
    // in accordance with the given coded parts and sample output
    static Voter new_voter;
    static int total_no_of_voters;
    static int current_voter_count;

    private Voter() {
        // System.out.println("1 Inside firstvoter " + "EVm no " + EVM.evm_count +
        // " voterno " + Voter.current_voter_count);
        current_voter_count++;
    }

    public static Voter getVoter() {
        // implement singleton behaviour
        // System.out.println("2 Inside firstvoter " + "EVm no " + EVM.evm_count +
        // "voterno " + Voter.current_voter_count + new_voter);
        if (new_voter == null) {
            new_voter = new Voter();
            return new_voter;
        }
        return null;
    }

    public void firstVoter() {
        // System.out.println("3 Inside firstvoter " + "EVm no " + EVM.evm_count +
        // "voterno " + Voter.current_voter_count );
        if (new_voter != null) {
            EVM new_machine = EVM.getEVM(new_voter);
            new_machine.startVoting();
        }
    }

    public void callNewVoter() {
        // Write code to setup a new EVM object for the new voter
        // System.out.println("4 Inside firstvoter " + "EVm no " + EVM.evm_count +
        // "voterno " + Voter.current_voter_count);
        if (Voter.current_voter_count < Voter.total_no_of_voters) {
            Voter v = Voter.getVoter();
            EVM evm = EVM.getEVM(v);
            // Ignore the following 6 lines of code
            // but do not delete this code in your submission
            // ========================================================================
            try {
                EVM x = EVM.getEVM(null);
                x.startVoting();
            } catch (NullPointerException e) {
                System.out.println("EVM is Singleton");
            }
            // ========================================================================
            // Resume writing your code here
            evm.startVoting();
        } // Hint: Write code to start voting for the new user on the new EVM
    }
}

class EVM {
    // Define appropriate variables for implementing singleton behaviour
    // in accordance with the given coded parts and sample output
    static Voter current_voter;
    static EVM new_evm;
    static int evm_count;

    private EVM(Voter v) {
        // System.out.println("a Inside firstvoter " + "EVm no " + EVM.evm_count +
        // "voterno " + Voter.current_voter_count);
        current_voter = v;
        evm_count++;
    }

    public static EVM getEVM(Voter v) {
        // Implement singleton behaviour
        // System.out.println("b Inside firstvoter " + "EVm no " + EVM.evm_count +
        // "voterno " + Voter.current_voter_count);
        if (new_evm == null) {
            new_evm = new EVM(v);
            return new_evm;
        }
        return null;
    }

    public void startVoting() {
        // Complete voting for the current voter and call the next voter
        // Hint : Use callback here
        // System.out.println("c Inside firstvoter " + "EVm no " + EVM.evm_count +
        // "voterno " + Voter.current_voter_count);
        System.out.println("voting under process on EVM number " + EVM.evm_count);
        System.out.println("Voting completed for voter " + Voter.current_voter_count);
        Voter.new_voter = null;
        EVM.new_evm = null;
        EVM.current_voter.callNewVoter();
    }
}

public class PA2_Election {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Voter.total_no_of_voters = s.nextInt();
        // Assume input is always non zero
        Voter v = Voter.getVoter();
        // Trying to create another voter when one voter is in the middle of
        // voting process, students can ignore this try-catch block of code
        try {
            Voter x = Voter.getVoter();
            x.callNewVoter();
        } catch (NullPointerException e) {
            System.out.println("Voter is Singleton");
        }
        // Starting the first vote of the day
        v.firstVoter();
    }
}