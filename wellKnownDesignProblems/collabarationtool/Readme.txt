Hiring managers ask this to explore algorithm basics and backgrounds. 
Before you begin, make sure you understand the purpose of the task. 
Knowing if the changes will be registered in real time, 
if locking will be necessary and if it needs to be naturally convergent will help you give a complete answer.

Example: "This system works on differential synchronization. 
It is keeping two or more copies of the same document synchronized with each other in real time, 
so if a change is made on one version, the same alteration happens on all the others. It is a complex challenge, 
but differential synchronization is scalable and fault tolerant. The three common approaches are ownership, 
event passing and three way merges. I last had to do this to support in-house document sharing for one of our clients. 
They wanted real-time collaboration, so three-way merging was not a good option since changes are lost and cannot take effect, 
as major collisions are common. I used event-passing to allow for real-time collaboration as 
the locking or ownership approach would only allow the first one opening the document to make any adjustment. 
This served our client well, as its employees were able to work collaboratively even when out of office or on different schedules."