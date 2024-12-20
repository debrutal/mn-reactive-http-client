# precondition

```bash
sudo apt install wrk
```

## load test

```bash
wrk -t20 -c200 -d60s http://localhost:8081/servicea
```
