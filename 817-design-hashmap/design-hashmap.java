class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] bucket;

    public MyHashMap() {
        bucket = new Node[1000];
    }

    public void put(int key, int value) {

        int index = key % 1000;

        Node current = bucket[index];

        while (current != null) {

            if (current.key == key) {
                current.value = value;
                return;
            }

            current = current.next;
        }

        Node newNode = new Node(key, value);

        newNode.next = bucket[index];

        bucket[index] = newNode;
    }

    public int get(int key) {

        int index = key % 1000;

        Node current = bucket[index];

        while (current != null) {

            if (current.key == key) {
                return current.value;
            }

            current = current.next;
        }

        return -1;
    }

    public void remove(int key) {

        int index = key % 1000;

        Node current = bucket[index];
        Node previous = null;

        while (current != null) {

            if (current.key == key) {

                if (previous == null) {
                    bucket[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }
}