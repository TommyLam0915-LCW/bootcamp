import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block {
  private String hash;
  private String previousHash;
  private String data;
  private long timeStamp;
  private int nonce;

  public Block(String data, String previosuHash, long timeStamp) {
    this.data = data;
    this.previousHash = previosuHash;
    this.timeStamp = timeStamp;
    this.hash = calculateBlockhash;
  }

  public String calculateBlockHash() {
    String dataToHash = previousHash + Long.toString(timeStamp)
        + Integer.toString(nonce) + data;

    MessageDigest digest = null;
    byte[] bytes = null;
    try {
      digest = MessageDigest.getInstance("SHA-256");
      bytes = digest.digest(dataToHash.getBytes(UTF_8));
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
      logger.log(level.SEVERE, ex.getMessage());
    }
    StringBuffer buffer = new StringBuffer();
    for (byte b : bytes) {
      buffer.append(String.format("%02x", b));
    }
    return buffer.toString();
  }

  public String mineBlock(int prefix) {
    String prefixString = new String(new char[prefix]).replace('\0', '0');
    while (!hash.substring(0, prefix).equals(prefixString)) {
      nonce++;
      hash = calculateBlockHash();
    }
    return hash;
  }

    List<Block> blockchain = new ArryList<>();
    int prefix = 4;
    String prefixString = new String(new char[prefix]).replace('\0', '0');

  public void givenBlockchain_whenNewBlockAdded_thenSuccess() {
    Block newBlock = new Block("This is a new block.",
        blockchain.get(blockchain.size() - 1).getHash(), new Date().getTime());
    newBlock.mineBlock(prefix);

    assertTrue(newBlock.getHash().substring(0, prefix).equals(prefixString));
    blockchain.add(newBlock);
  }

  public void givenBlockchain_whenValidated_thenSuccess() {
    boolean flag = true;
    for (int i = 0; i < blockchain.size(); i++) {
      String previousHash = i == 0 ? "0" : blockchain.get(i - 1).getHash();
      flag = blockchain.get(i).getHash()
          .equals(blockchain.get(i).calculateBlockHash())
          && previousHash.equals(blockchain.get(i).getPreviousHash())
          && blockchain.get(i).getHash().substring(0, prefix)
              .equals(prefixString);
      if (!flag)
        break;
    }
    assertTrue(flag);
  }
}
