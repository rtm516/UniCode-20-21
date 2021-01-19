# Attack Cleanup (Jan 4th - 18th)
## Files
 * [`AttackCleanup.java`](./AttackCleanup.java) is my solution that I submitted
 * [`AttackCleanup100.java`](./AttackCleanup100.java) is an adjustment of mine that gives 100% (worked this out after submission)
    * The change allows for 2+ digits to be handled properly
    
## Score
60%
00:09:02.2320000

## Info
We've had a database breach, and some of our data has been altered - perhaps for mischievous reasons, perhaps for more practical reasons...

We have some data from back-ups matched with their altered values - can you use this to write a function that will restore any data that was added since the last back-up to it's correct state? We've populated some unit tests with the data for you.

Just something to be aware of - the original data is GCAT sequences - only containing letters: no numbers or other characters.

```
cgtctcctgaccccagagcaggtcgtggcaatcgcgagcaataacggcggaaaacaggctttggaaacggtgcagaggctccttccagtgctgtgccaagcgcacggactcaccccagagcaggtcgtggcgatcgcaagccacgacggaggaaagcaagccttggaaacagtacagaggctgttgcctgtgctgtgccaagcgcacggcctcaccccagagcaggtcgtggcaatcgcctccaacattggcgggaaacaggcactcgagactgtccagcgcctgcttcccgtgctgtgccaagcgcacggattaaccccagagcaggtcgtggccattgcctcgaatggagggggcaaacaggcgttggaaaccgtacaacgattgctgccggtgctgtgccaagcgcacggcttaagagacg
```