package org.example;

import java.util.HashMap;
import java.util.Map;


public class AttackTrees {
    private Map<String, Boolean> attackNodes;

    public AttackTrees() {
        this.attackNodes = new HashMap<>();
    }

    public void addAttackNode(String node, boolean isAchieved) {
        attackNodes.put(node, isAchieved);
    }

    public boolean isAttackAchieved(String node) {
        return attackNodes.getOrDefault(node, false);
    }


    public void setAttackNodes(Map<String, Boolean> attackNodes) {
        this.attackNodes = attackNodes;
    }

    @Override
    public String toString() {
        return "Attack Tree:\n" +
                "Nodes: " + attackNodes;
    }
}
