class Solution:
    def finalValueAfterOperations(self, operations: list[str]) -> int:
        x = 0
        for i in range (0,len(operations)):
            if operations[i].startswith('-') or operations[i].endswith('-'):
                x-=1
            else:
                x+=1
        return x

        