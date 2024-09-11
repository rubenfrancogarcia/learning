package garcia.ruben.learning_module.leetcode;

import garcia.ruben.coding_problems.Leetcode;
import garcia.ruben.utils.data_structures.ListNode;
import garcia.ruben.utils.data_structures.TreeNode;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class) @MockitoSettings(strictness = Strictness.WARN)
public class leetcodeTests {
    @InjectMocks
    Leetcode leetcode = new Leetcode();

    @Test
    public void test_1367_false(){
        ListNode listNode1 = new ListNode(5, null);
        ListNode listNode = new ListNode(1,listNode1 );
        TreeNode treeNode3 = new TreeNode(1, null, null);
        TreeNode treeNode2 = new TreeNode(11, null, null);
        TreeNode treeNode1 = new TreeNode(5, treeNode3, null);
        TreeNode treeNode = new TreeNode(0, treeNode1, treeNode2);
        boolean result = leetcode.isSubPath_1367(listNode,treeNode);
        assertEquals(false, result);
    }

    @Test
    public void test_1367_true(){
        ListNode listNode1 = new ListNode(5, null);
        ListNode listNode = new ListNode(1,listNode1 );
        TreeNode treeNode3 = new TreeNode(5, null, null);
        TreeNode treeNode2 = new TreeNode(11, null, null);
        TreeNode treeNode1 = new TreeNode(1, treeNode3, null);
        TreeNode treeNode = new TreeNode(0, treeNode1, treeNode2);
        boolean result = leetcode.isSubPath_1367(listNode,treeNode);
        assertEquals(true, result);
    }

    @Test
    public void test_1367_true1(){
        //head =
        //[4,2,8]
        //root =
        //[1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
        ListNode listNode1 = new ListNode(5, null);
        ListNode listNode = new ListNode(1,listNode1 );
        TreeNode treeNode3 = new TreeNode(5, null, null);
        TreeNode treeNode2 = new TreeNode(11, null, null);
        TreeNode treeNode1 = new TreeNode(1, treeNode3, null);
        TreeNode treeNode = new TreeNode(0, treeNode1, treeNode2);
        boolean result = leetcode.isSubPath_1367(listNode,treeNode);
        assertEquals(true, result);
    }

    @Test
    public void test_1367_true2(){
        //head =
        //[1,4,2,6]
        //root =
        //[1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
        ListNode listNode = new ListNode().populate(new int[]{1,4,2,6});
        TreeNode treeNode3 = new TreeNode(5, null, null);
        TreeNode treeNode2 = new TreeNode(11, null, null);
        TreeNode treeNode1 = new TreeNode(1, treeNode3, null);
        TreeNode treeNode = new TreeNode(0, treeNode1, treeNode2);
        boolean result = leetcode.isSubPath_1367(listNode,treeNode);
        assertEquals(true, result);
    }
}
