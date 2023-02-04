import java.util.Arrays;
/**
 * Purpose:  Tester for canidadte w/o arraylist
 *
 * @author Mac Lawson
 * @version 1/12/22
 */
public class ElectionTesterV7
{
    public static void main(String[] args)
    {
        // Create an array of Candidate objects
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Alice", 50);
        candidates[1] = new Candidate("Bob", 40);
        candidates[2] = new Candidate("Charlie", 35);
        candidates[3] = new Candidate("Dave", 45);
        candidates[4] = new Candidate("Eve", 55);
        // Changing candidates
        
        deleteByPosition(candidates, 1);

        
        deleteByName(candidates, "Eve");

        // Print the names and votes of all candidates
        printCandidates(candidates);
        

        // Print the total number of votes
        int totalVotes = getTotalVotes(candidates);
        System.out.println("Total votes: " + totalVotes);

        // Print a table with the candidates' names, votes, and percentage of total votes
        printElectionResults(candidates, totalVotes);
    }

public static void printCandidates(Candidate[] candidates) {
    for (Candidate c : candidates) {
        if (c != null) {
            System.out.println(c.getName() + ": " + c.getVotes() + " votes");
        }
    }
}


public static int getTotalVotes(Candidate[] candidates) {
    int totalVotes = 0;
    for (Candidate c : candidates) {
        if (c != null) {
            totalVotes += c.getVotes();
        }
    }
    return totalVotes;
}


public static void printElectionResults(Candidate[] candidates, int totalVotes) {
    System.out.println("Deleted Candidate 1 and Eve");
    System.out.println("\nCandidate     Votes     % of Total Votes");
    System.out.println("---------------------------------------");

    for (Candidate c : candidates) {
        if (c != null) {
            double percentage = (double) c.getVotes() / totalVotes * 100;
            System.out.printf("%-14s%6d%14.1f\n", c.getName(), c.getVotes(), percentage);
        }
    }
}

    public static void changeName(Candidate[] candidates, String name, String replacementName)
{
    for (Candidate c : candidates)
    {
        if (c.getName().equals(name))
        {
            c.setName(replacementName);
            break;
        }
    }
}

public static void changeVotes(Candidate[] candidates, String name, int replacementVotes)
{
    for (Candidate c : candidates)
    {
        if (c.getName().equals(name))
        {
            c.setVotes(replacementVotes);
            break;
        }
    }
}

public static void replaceCandidate(Candidate[] candidates, String name, String replacementName, int replacementVotes)
{
    for (int i = 0; i < candidates.length; i++)
    {
        if (candidates[i].getName().equals(name))
        {
            candidates[i] = new Candidate(replacementName, replacementVotes);
            break;
        }
    }
}

public static void insertAtPosition(Candidate[] candidates, int position, String name, int votes) {
    if (position < candidates.length) {
        // Shift elements to the right to make room for new candidate
        for (int i = candidates.length - 1; i > position; i--) {
            candidates[i] = candidates[i - 1];
        }
        // Insert new candidate at specified position
        candidates[position] = new Candidate(name, votes);
    }
}


public static void insertBeforeName(Candidate[] candidates, String name, String newName, int newVotes) {
for (int i = 0; i < candidates.length; i++) {
if (candidates[i] != null && candidates[i].getName().equals(name)) {
insertAtPosition(candidates, i, newName, newVotes);
break;
}
}
}   

public static void deleteByPosition(Candidate[] candidates, int position) {
    for (int i = position; i < candidates.length - 1; i++) {
        candidates[i] = candidates[i + 1];
    }
    candidates[candidates.length - 1] = null;
}

public static void deleteByName(Candidate[] candidates, String name) {
    for (int i = 0; i < candidates.length; i++) {
        if (candidates[i] == null) {
        break;
        }
        if (candidates[i].getName().equals(name)) {
            deleteByPosition(candidates, i);
            break;
        }
    }
}




    
}
