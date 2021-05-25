# Assignment2 on Operating Systems
1. The program OS1Assignment takes in the binary file path as an argument
2. The 2d integer array is for page table, and their corresponding physical frames
3. ArrayList 1  file_data is for the file data contents read which are the virtual addresses of type unsigned long
4. ArrayLIst 2 file_output is for the physical addresses as hexadecimal 
5. Use FileInputStream and DataInputStream to read the binary file contents
6. Read the binary file contents as long. 
7. Reverse the bytes read 
8. Convert the read bytes to unsigned long
9. add the virtual address in decimal to file_data ArrayList
10. Loop through the file_data arraylist convert each virtual address to check the hexadecimal values of the addresses
11. convert the virtual address to binary 
12. Convert the binary virtual addresses to 32 bit by left padding zeros to the binary address
13. Take the most significant 25 bits to get the index of the page number in the page table when converted to decimal to get the index
14. Get the page number at the decimal index in the page_table array 
15. Convert the page number to binary and append the page offset bits i.e. last 7 bits of the binary virtual address
16. Convert the result to hexadecimal to get the physical address in binary
17. add the physical address to the file_output array list.
18. Loop through the arraylist to write each physical address to the output-OS1.txt file
19. Use FileOutputStream and DataOutputStream to write to the text file.
20. Left pad the address with zeros and "0x" to get the 8 byte physical address

# gitlog.txt file contains git log
# output-OS1.txt contains the physical addresses in string
# bin and out folders both contain class file of OS1Assignment
# src contains the source file of OS1Assignment
# docs contains the javadoc for the OS1Assignment
# Makefile file to build the OS1Assignment
# OS1sequence, OS1testsequence are binary files passes as arguments in our program
