package com.leetcode.sort;

import java.util.Arrays;

/**
 * @author: 𝓛.𝓕.𝓠
 * 单向链表反转:1->2->3  3->2->1
 * 1->2->3->4   4->3->2->1
 */

public class ReverseSingleList {
    //借助外部数组
    public static void reverse01(Node root) {
        int arr[] = {};
        Node nodes[] = {};
        Node newRoot = null;
        while (root != null) {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = root.value;
            root = root.next;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            Node node = new Node();
            node.value = arr[i];
            nodes = Arrays.copyOf(nodes, nodes.length + 1);
            nodes[nodes.length - 1] = node;
        }

        for (int i = 1; i < nodes.length; i++) {
            if (i == 1) newRoot = nodes[i - 1];
            nodes[i - 1].next = nodes[i];
        }
        System.out.print("①：");
        while (newRoot != null) {
            System.out.print(newRoot.value);
            newRoot = newRoot.next;
            if (newRoot != null) System.out.print("->");
        }
    }

    public static void reverse02(Node root) {
        Node nodes[] = {};
        Node newRoot = null;
        while (root != null) {
            nodes = Arrays.copyOf(nodes, nodes.length + 1);
            nodes[nodes.length - 1] = root;
            root = root.next;
        }
        newRoot = nodes[nodes.length - 1];
        for (int i = nodes.length - 1; i > 0; i--) {
            nodes[i].next = nodes[i - 1];
            //消除原来第一个元素的指针，避免死循环
            if (i == 1) nodes[0].next = null;
        }
        System.out.print("②：");
        while (newRoot != null) {
            System.out.print(newRoot.value);
            if (newRoot.next != null) System.out.print("->");
            newRoot = newRoot.next;
        }
    }


    public static void main(String[] args) {
        Node root = new Node();
        Node second = new Node();
        Node third = new Node();
        root.value = 1;
        root.next = second;
        second.value = 2;
        second.next = third;
        third.value = 3;

        reverse01(root);
        System.out.println("\n--------------");
        reverse02(root);
    }
}
