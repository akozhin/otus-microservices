# Основы работы с Kubernetes - минимальный сервис
## Задание
**Создать минимальный сервис, который**
- отвечает на порту 8000
- имеет http-метод `GET /health/`, который отвечает `{"status": "OK"}` 

**Чеклист**
- Cобрать локально образ приложения в docker 
- Запушить образ в dockerhub 
- Написать манифесты для деплоя в k8s для этого сервиса. 
- Манифесты должны описывать сущности Deployment, Service, Ingress. 
- В Deployment могут быть указаны Liveness, Readiness пробы. 
- Количество реплик должно быть не меньше 2. 
- Image контейнера должен быть указан с Dockerhub. 
- Хост в ингрессе должен быть arch.homework. 

**Результат**

- Ссылку на github c манифестами. 
- Манифесты должны лежать в одной директории, так чтобы можно было их все применить одной командой `kubectl apply -f .`

**Задание со звездой\* (+5 баллов):** 
- В Ingress-е должно быть правило, которое форвардит все запросы с `/otusapp/{student name}/*` на сервис с rewrite-ом пути. Где {student name} - это имя студента.

Проверка

http://arch.homework/health должен отдавать {“status”: “OK”}.

## Результат
Для задания со правило редиректит на `/health`

```bash
cd services/user-service/infra
k apply -f .
curl http://arch.homework/health
curl http://arch.homework/student/akozhin/test
```