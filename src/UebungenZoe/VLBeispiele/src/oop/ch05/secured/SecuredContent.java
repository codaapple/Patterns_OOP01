package oop.ch05.secured;

import java.util.Random;

/**
 * Represents containers for some content that is secured against modifications
 * by a challenge-response approach. The content may be read at any time, but
 * only authorized clients are allowed to modify the contents.
 *
 * @author Mark Minas
 */
public class SecuredContent {
  /**
   * The actual, secured content
   */
  private Object content;
  /**
   * A random number generator used for generating challenges.
   */
  private final Random random = new Random();
  /**
   * The password used for encryption.
   */
  private final int password;

  /**
   * Creates a new container containing the specified contents.
   *
   * @param password this password is used for computing the expected response for a
   *                 challenge.
   * @param content  the contained content
   */
  public SecuredContent(int password, Object content) {
    this.password = password;
    this.content = content;
  }

  /**
   * Returns the contained contents. There is no authorization necessary for
   * reading the contents.
   */
  public Object getContent() {
    return content;
  }

  /**
   * Sets the new contained contents. Only authorized clients are allowed to do
   * so.
   *
   * @param client  The accessing client. Authorization is checked prior to really
   *                modifying he contained content.
   * @param content The new contained contents
   * @throws AuthorizationException if the specified client cannot authorize himself
   */
  public void setContent(SecurityClient client, Object content)
      throws AuthorizationException {
    final int challenge = nextChallenge();
    if (client.challengeResponse(challenge) != requiredResponse(challenge))
      throw new AuthorizationException(client
                                       + " is not authorized to access contents.");
    this.content = content;
  }

  /**
   * Computes the next random challenge.
   */
  private int nextChallenge() {
    return random.nextInt();
  }

  /**
   * Returns the expected response for the specified challenge.
   *
   * @param challenge an arbitrary integer used as a challenge
   */
  private int requiredResponse(int challenge) {
    return challenge ^ password;
  }
}
