#!/usr/bin/env bash
DIR="$( cd "$( dirname "$0"  )" && pwd  )"
ENVIRONMENT=production ansible-playbook -i $DIR/inventory/production/hosts $DIR/playbook.yml