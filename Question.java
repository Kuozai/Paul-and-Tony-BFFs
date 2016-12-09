
/**
 * A question
 * @author Dat Mofo
 *
 */
public class Question {
  String question;
  String answer;
  int value;

  /**
   * Constructor for a blank question
   */
  public Question() {
    question = "";
    answer = "";
    value = 0;
  }

  /**
   * Constructor for a question with given parameters
   * @param question
   * @param answer
   * @param value
   */
  public Question(String question, String answer, int value) {
    this.question = question;
    this.answer = answer;
    this.value = value;
  }

  /**
   * Gets a question
   * @return question
   */
  public String getQuestion() {
    return question;
  }

  /**
   * Gets the answer
   * @return answer
   */
  public String getAnswer() {
    return answer;
  }

  /**
   * Gets the position of the question
   * @return value
   */
  public int getValue() {
    return value;
  }

  /**
   * Sets a question
   * @param question the question
   */
  public void setQuestion(String question) {
    this.question = question;
  }

  /**
   * Sets the question's answer
   * @param answer the answer
   */
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  /**
   * Sets the question's position
   * @param value value
   */
  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    // Put whatever the fuck he wants here

  }
}
