package garcia.ruben.learning_module.data_strucutres;

import garcia.ruben.utils.data_structures.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class) @MockitoSettings(strictness = Strictness.WARN)
public class DataStructuresTests {
    @InjectMocks
    ListNode listNode = new ListNode();

    @Test
    public void populateLinkedList(){
        int[] arr = new int[]{1, 2, 3};
        ListNode listNodeResponse = listNode.populate(arr);
        Assert.assertEquals(2,listNodeResponse.getNext().getVal());
    }
}
