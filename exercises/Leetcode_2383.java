package exercises;

public class Leetcode_2383 {
    public int minNumberOfHours(
            int initialEnergy,
            int initialExperience,
            int[] energy,
            int[] experience) {

        int totalExerciseHour = 0;

        int energyLen = energy.length;

        for (int i = 0; i < energyLen; i++) {
            int toBeAdd = energy[i] >= initialEnergy ? (energy[i] - initialEnergy + 1) : 0;
            initialEnergy += toBeAdd;
            totalExerciseHour += toBeAdd;


            toBeAdd = experience[i] >= initialExperience ? (experience[i] - initialExperience + 1) : 0;
            totalExerciseHour += toBeAdd;
            initialExperience += toBeAdd;

            initialEnergy -= energy[i];
            initialExperience += experience[i];

        }

        return totalExerciseHour;
    }

    public static void main(String[] args) {

        // int initialEnergy = 5;
        // int initialExperience = 3;
        // int[] energy = { 1, 4, 3, 2 };
        // int[] experience = { 2, 6, 3, 1 };

        int initialEnergy = 3;
        int initialExperience = 2;
        int[] energy = { 1 };
        int[] experience = { 2 };

        Leetcode_2383 l2383 = new Leetcode_2383();

        System.out.println(String.format("total need extra training time is [%d]",
                l2383.minNumberOfHours(initialEnergy, initialExperience, energy, experience)));
    }
}
