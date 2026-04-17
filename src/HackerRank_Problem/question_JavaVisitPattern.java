package HackerRank_Problem;

import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() { return value; }
    public Color getColor() { return color; }
    public int getDepth() { return depth; }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void addChild(Tree child) {
        children.add(child);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children) {
            child.accept(visitor);
        }
    }
}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}

// Visitor 1
class SumInLeavesVisitor extends TreeVis {
    int sum = 0;

    public int getResult() { return sum; }

    public void visitNode(TreeNode node) { }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}

// Visitor 2
class ProductOfRedNodesVisitor extends TreeVis {
    long product = 1;
    final int MOD = 1000000007;

    public int getResult() { return (int) product; }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product = (product * node.getValue()) % MOD;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product = (product * leaf.getValue()) % MOD;
        }
    }
}

// Visitor 3
class FancyVisitor extends TreeVis {
    int evenDepthSum = 0;
    int greenLeafSum = 0;

    public int getResult() {
        return Math.abs(evenDepthSum - greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            evenDepthSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafSum += leaf.getValue();
        }
    }
}

public class question_JavaVisitPattern {

    static int[] values;
    static Color[] colors;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static Tree buildTree(int node, int depth) {
        visited[node] = true;

        boolean isLeaf = true;
        for (int child : adj[node]) {
            if (!visited[child]) {
                isLeaf = false;
            }
        }

        if (isLeaf) {
            return new TreeLeaf(values[node], colors[node], depth);
        }

        TreeNode treeNode = new TreeNode(values[node], colors[node], depth);

        for (int child : adj[node]) {
            if (!visited[child]) {
                treeNode.addChild(buildTree(child, depth + 1));
            }
        }

        return treeNode;
    }

    public static Tree solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        colors = new Color[n];
        for (int i = 0; i < n; i++) {
            colors[i] = (sc.nextInt() == 0) ? Color.RED : Color.GREEN;
        }

        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj[u].add(v);
            adj[v].add(u);
        }

        visited = new boolean[n];
        return buildTree(0, 0);
    }

    public static void main(String[] args) {
        Tree root = solve();

        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        System.out.println(vis1.getResult());
        System.out.println(vis2.getResult());
        System.out.println(vis3.getResult());
    }
}
/*

                                //QUESTION

🟢 Java Visitor Pattern – Problem Statement

Ek tree diya gaya hai jisme:

Har node ke paas:
ek integer value hai
ek color hai → RED ya GREEN
ek depth hai (root ka depth = 0)

👉 Tree me 2 type ke nodes hote hain:

TreeNode → jiske children hote hain
TreeLeaf → jiske children nahi hote
🔹 Tumhara Task

Tumhe Visitor Pattern use karke 3 alag classes implement karni hain:

1️⃣ SumInLeavesVisitor

👉 Sirf leaf nodes ka sum return karo

2️⃣ ProductOfRedNodesVisitor

👉 Sirf RED nodes ka product return karo
👉 Answer ko modulo 10^9 + 7 se lena hai

3️⃣ FancyVisitor

👉 Calculate:

(sum of values of non-leaf nodes at even depth)
− (sum of values of green leaf nodes)

👉 Final answer ka absolute value return karo

🔸 Input Format
First line: integer n (number of nodes)
Second line: n integers → node values
Third line: n integers → colors
0 → RED
1 → GREEN
Next n-1 lines: edges (u v)
🔸 Output Format

3 lines print karo:

Sum of leaf nodes
Product of red nodes
Fancy visitor result


🔹 Sample Input
5
4 7 2 5 12
0 1 0 0 1
1 2
1 3
3 4
3 5


🔹 Sample Output
24
40
15
🔍 Explanation (Short)
Leaf nodes ka sum → 24
Red nodes ka product → 40
Fancy formula → 15
⚠️ Important Rules
Tree rooted at node 1
Depth root ka = 0
Visitor pattern follow karna mandatory
🧠 Core Idea

👉 Tree traverse karo
👉 Har node pe visitor ka method call hoga
👉 Condition ke basis pe result calculate karo
 */