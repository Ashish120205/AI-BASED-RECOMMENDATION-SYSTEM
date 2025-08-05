# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: ASHISH KUMAR

*INTERN ID*: CT04DH1575

*DOMAIN*: JAVA PROGRAMMING 

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR

**DESCRIPTION OF TASK** :
        This Java-based recommender system demonstrates the implementation of an item-based collaborative filtering approach using the Apache Mahout machine learning library. The application is structured around the use of several key libraries including mahout-core, mahout-math, Google's guava, Apache commons-math3, and logging libraries from the slf4j suite. The core goal of the program is to read user-item preference data from a CSV file and generate personalized recommendations for a user based on the similarity between items they have and haven't interacted with. This simulation reflects a real-world recommendation engine similar to those used in platforms like Amazon, Netflix, or Spotify.

The primary functionality starts with reading data from a CSV file (data.csv) using Mahout's FileDataModel. This file must be formatted in a simple way with each line representing a user ID, an item ID, and a preference score (e.g., rating). Once the data is loaded, Mahout uses this model to build an in-memory representation of all user-item interactions.

The **PearsonCorrelationSimilarity** is applied to calculate the similarity between items. This metric helps determine how likely a user is to prefer an item based on their past preferences and the behavior of others with similar taste.

The **GenericItemBasedRecommender** class is used to build the actual recommender engine. This class processes the data model and similarity matrix to compute the top-N recommendations.

The application uses a console interface to interact with the user. It continuously prompts for a user ID and displays up to 5 recommended items along with an estimated preference score.

To manage dependencies and internal computation:
**mahout-core-0.9.jar** contains the primary recommender algorithms and data models.
**mahout-math-0.9.jar** includes mathematical operations, vectors, and matrices used behind the scenes for similarity calculations.
**guava-18.0.jar** provides utility functions and collections that Mahout depends on.
**commons-math3-3.6.1.jar** supports advanced mathematical functions for computing correlations and other statistical models.
**slf4j-api-1.7.30.jar** and **slf4j-simple-1.7.30.jar** handle logging within Mahout and output runtime information such as model loading, user count, and error messages, making debugging and analysis easier.

Error handling is built into the program using try-catch blocks to handle exceptions like file read errors, non-existent user IDs, or malformed data. If there are no recommendations for a given user (e.g., due to lack of data), the program gracefully informs the user instead of crashing. The recommendation process is also scalable and can easily handle larger datasets if needed.

In conclusion, this recommender application not only teaches the essentials of building an item-based collaborative filtering system using Mahout, but also integrates practical usage of third-party libraries for file handling, mathematical computation, and logging. It reflects how modern recommender systems function internally and provides a foundation for extending the system into more complex domains such as hybrid recommendation models, real-time updates, and personalized content filtering.



<img width="1455" height="950" alt="Image" src="https://github.com/user-attachments/assets/4262db8d-d3b0-44b2-800d-c434558988f6" />
