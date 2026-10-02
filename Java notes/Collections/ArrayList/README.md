ArrayList internally ek array ka use karti hai.

Jab ArrayList ki internal array ki capacity full ho jaati hai,
toh ArrayList ek larger array create karti hai aur purane elements
ko naye array mein copy karti hai.

Java ke current ArrayList implementation mein growth generally
old capacity ka 1.5x hoti hai.

<img width="1020" height="395" alt="image" src="https://github.com/user-attachments/assets/2a10ab7f-75b8-45f8-8241-e720e443411c" />


.size()
→ ArrayList mein currently kitne elements hain.

.ensureCapacity(n)
→ ArrayList ki internal capacity ko kam se kam n elements ke
  liye ensure karta hai.
