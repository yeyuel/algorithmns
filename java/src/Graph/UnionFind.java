package Graph;

import java.util.HashMap;
import java.util.Map;

public abstract  class UnionFind {
    protected int[] id;
    protected int count;

    public UnionFind(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    protected abstract int find(int p);
    protected abstract void union(int p, int q);

    public static void main(String[] args) {
        int N = 10;
        Map<Integer, Integer> data = new HashMap<Integer, Integer>() {
            {
                put(4, 3);
                put(3, 8);
                put(6, 5);
                put(9, 4);
                put(2, 1);
                put(8, 9);
                put(5, 0);
                put(7, 2);
                put(6, 1);
                put(1, 0);
                put(6, 7);
            }
        };
//        UnionFind uf = new QuickFind(N);
//        UnionFind uf = new QuickUnion(N);
        UnionFind uf = new WeightQuickUion(N);
        for (Map.Entry<Integer, Integer> entry: data.entrySet()) {
            int p = entry.getKey();
            int q = entry.getValue();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(uf.count() + "components");
    }
}


class QuickFind extends UnionFind {

    public QuickFind(int N) {
        super(N);
    }

    @Override
    protected void union(int p, int q) {
        int pID = id[p];
        int qID = id[q];

        if (pID == qID) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) id[i] = qID;
        }
        count--;
    }

    @Override
    protected int find(int p) {
        return id[p];
    }
}

class QuickUnion extends UnionFind {
    public QuickUnion(int N) {
        super(N);
    }

    @Override
    protected int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    @Override
    protected void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return;

        id[pRoot] = qRoot;
        count--;
    }
}

class WeightQuickUion extends UnionFind {

    // tree element size
    private int[] sz;

    public WeightQuickUion(int N) {
        super(N);
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    @Override
    protected int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    @Override
    protected void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[j] += sz[i];
        }
        count--;
    }
}




