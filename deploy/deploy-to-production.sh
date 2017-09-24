#!/usr/bin/env bash
DIR="$( cd "$( dirname "$0"  )" && pwd  )"
ENVIRONMENT=production ansible-playbook -i $DIR/hosts $DIR/playbook.yml