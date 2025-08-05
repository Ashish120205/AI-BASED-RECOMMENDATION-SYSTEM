import org.apache.mahout.cf.taste.impl.model.file.FileDataModel; // Loads data from a file
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender; // Item-based recommender
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity; // Computes similarity between items
import org.apache.mahout.cf.taste.model.DataModel; // Represents the dataset
import org.apache.mahout.cf.taste.recommender.RecommendedItem; // Represents a recommended item
import org.apache.mahout.cf.taste.similarity.ItemSimilarity; // Interface for item similarity

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class RecommenderApp {

    public static void main(String[] args) {
        try {
            // Load data from CSV file named "data.csv"
            // The CSV format should be: userID,itemID,preference
            File dataFile = new File("data.csv");
            DataModel model = new FileDataModel(dataFile); // Load the data model

            // Create a similarity metric using Pearson Correlation on the items
            ItemSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Create an item-based recommender using the data model and item similarity
            GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(model, similarity);

            // Scanner is used to get user input from the console
            Scanner scanner = new Scanner(System.in);

            // Keep running until user manually exits (Ctrl+C)
            while (true) {
                // Ask user to input a user ID to get recommendations for
                System.out.print("Enter user ID to get recommendations (or Ctrl+C to exit): ");
                long userId = scanner.nextLong(); // Read user input

                // Generate top 5 recommended items for the given user
                List<RecommendedItem> recommendations = recommender.recommend(userId, 5);

                // Print recommendations or say no recommendations available
                System.out.println("\nRecommended items for user " + userId + ":");
                if (recommendations.isEmpty()) {
                    System.out.println("  No recommendations available for this user.");
                } else {
                    // Loop through each recommended item and print its details
                    for (RecommendedItem recommendation : recommendations) {
                        System.out.printf("  Item ID: %d, Estimated Preference: %.2f%n",
                                recommendation.getItemID(), recommendation.getValue());
                    }
                }
                System.out.println("---------------------------\n"); // Separator after each output
            }

        } catch (Exception e) {
            // Catch and display any exception that might occur (e.g., file not found, invalid user ID)
            e.printStackTrace();
        }
    }
}








