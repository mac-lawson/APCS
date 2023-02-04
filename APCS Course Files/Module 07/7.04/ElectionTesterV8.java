import java.util.ArrayList;
import java.util.List;
/**
 * Purpose:  Tester for canidadte with arraylist
 *
 * @author Mac Lawson
 * @version 1/12/22
 */
public class ElectionTesterV8
{
    public static void main(String[] args)
    {
        // Create an ArrayList of Candidate objects
        ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Alice", 50));
        candidates.add(new Candidate("Bob", 40));
        candidates.add(new Candidate("Charlie", 35));
        candidates.add(new Candidate("Dave", 45));
        candidates.add(new Candidate("Eve", 55));
        // Changing candidates
        deleteByPosition(candidates, 1);

        // Find candidate "Bob" and insert new candidate before it
        deleteByName(candidates, "Eve");

        // Print the names and votes of all candidates
        printCandidates(candidates);

        // Print the total number of votes
        int totalVotes = getTotalVotes(candidates);
        System.out.println("Total votes: " + totalVotes);

        // Print a table with the candidates' names, votes, and percentage of total votes
        printElectionResults(candidates, totalVotes);
    }

    public static void printCandidates(List<Candidate> candidates)
    {
        for (Candidate c : candidates)
        {
            System.out.println(c.getName() + ": " + c.getVotes() + " votes");
        }
    }

    public static int getTotalVotes(List<Candidate> candidates)
    {
        int totalVotes = 0;
        for (Candidate c : candidates)
        {
            totalVotes += c.getVotes();
        }
        return totalVotes;
    }

    public static void printElectionResults(List<Candidate> candidates, int totalVotes)
    {
    System.out.println("Deleted Candidate 1 and Eve");



        // Print a table header
        System.out.println("\nCandidate     Votes     % of Total Votes");
        System.out.println("---------------------------------------");

        // Print the results for each candidate
        for (Candidate c : candidates)
        {
            double percentage = (double) c.getVotes() / totalVotes * 100;
            System.out.printf("%-14s%6d%14.1f\n", c.getName(), c.getVotes(), percentage);
        }
    }
    public static void changeName(ArrayList<Candidate> candidates, String name, String replacementName)
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

public static void changeVotes(ArrayList<Candidate> candidates, String name, int replacementVotes)
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

public static void replaceCandidate(ArrayList<Candidate> candidates, String name, String replacementName, int replacementVotes)
{
    for (int i = 0; i < candidates.size(); i++)
    {
        if (candidates.get(i).getName().equals(name))
        {
            candidates.set(i, new Candidate(replacementName, replacementVotes));
            break;
        }
    }
}
public static void insertAtPosition(ArrayList<Candidate> candidates, int position, String name, int votes) {
        candidates.add(position, new Candidate(name, votes));
    }

public static void insertBeforeName(ArrayList<Candidate> candidates, String name, String newName, int newVotes) {
        int position = -1;
        // Find position of specified candidate
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getName().equals(name)) {
                position = i;
                break;
            }
        }
        candidates.add(position, new Candidate(newName, newVotes));
    }
public static void deleteByPosition(ArrayList<Candidate> candidates, int position) {
    candidates.remove(position);
}
public static void deleteByName(ArrayList<Candidate> candidates, String name) {
    for (int i = 0; i < candidates.size(); i++) {
        if (candidates.get(i).getName().equals(name)) {
            candidates.remove(i);
            break;
        }
    }
}



}
