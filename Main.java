class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", "broadleaf", true, "yellow");

    tree1.print();
    tree2.print();

    tree1.setTreeName("spruce");
    tree1.setTreeType("conifer");
    tree1.print();
  }
}